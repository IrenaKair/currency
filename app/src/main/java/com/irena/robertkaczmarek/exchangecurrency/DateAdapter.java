package com.irena.robertkaczmarek.exchangecurrency;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class DateAdapter extends RecyclerView.Adapter<CurrencyViewHolder> {
    List<Currency1> currencyList;

    Currency1 c;
    public DateAdapter(List<Currency1> currency) {
        this.currencyList = currency;

    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View date = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dane,viewGroup,false);
        CurrencyViewHolder currencyViewHolder = new CurrencyViewHolder(date);
        return currencyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder currencyViewHolder, int i) {
        c = currencyList.get(i);
        currencyViewHolder.date.setText(c.getName());
        currencyViewHolder.rate.setText(String.valueOf(c.getRate()));
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }
}
