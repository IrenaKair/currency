package com.irena.robertkaczmarek.exchangecurrency;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<CurrencyExchange> {

    private final String BASE_URL = "http://data.fixer.io/api/";
    private final String ACCES_KEY = "154a08fd9e7b04f7c3023d629a935895";
    TextView textView;
    RecyclerView recyclerView1;
    DateAdapter dateAdapter;
    List<CurrencyExchange> currencyExchanges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  loudCurrencyExchangeData();

        List<Currency1> currencyList = new ArrayList<>();
        currencyExchanges = new ArrayList<>();
        // textView = (TextView) findViewById(R.id.text);
        recyclerView1 = (RecyclerView) findViewById(R.id.recyclerViewList);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        dateAdapter = new DateAdapter(currencyList);
        recyclerView1.setAdapter(dateAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        loudCurrencyExchangeData();
    }

    private  void loudCurrencyExchangeData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CurrencyExchangeService service = retrofit.create(CurrencyExchangeService.class);
       Call<CurrencyExchange> call = service.loudCurrencyExchange(ACCES_KEY);
       call.enqueue(this);
    }

    @Override
    public void onResponse(Call<CurrencyExchange> call, Response<CurrencyExchange> response) {
        Toast.makeText(this, response.body().getDate() + " wal "+ response.body()
                .getRates().getAOA(),Toast.LENGTH_LONG).show();
         //   for ( int i = 0; i<response.body().getCurrencyList().size(); i++) {
            //    textView.setText(" waluta AOA :" + response.body().getCurrencyList());

        recyclerView1.setAdapter(new DateAdapter(response.body().getCurrencyList()));
        //    }
    }

    @Override
    public void onFailure(Call<CurrencyExchange> call, Throwable t) {
        Toast.makeText(this, t.getMessage(),Toast.LENGTH_LONG).show();
    }
}
