package com.irena.robertkaczmarek.exchangecurrency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyExchangeService {
    @GET("latest?symbols=AED,AFN,ALL,AMD,ANG,AOA,ARS,AUD,AWG,AZN,BAM,BBD,BDT,BGN,PLN,GBP,USD")
    Call<CurrencyExchange> loudCurrencyExchange(@Query("access_key") String key);

}
