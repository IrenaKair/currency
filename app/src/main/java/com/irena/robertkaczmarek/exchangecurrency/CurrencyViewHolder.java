package com.irena.robertkaczmarek.exchangecurrency;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class CurrencyViewHolder extends RecyclerView.ViewHolder {
    TextView date;
    TextView rate;
    public CurrencyViewHolder(@NonNull View itemView) {
        super(itemView);
        date = (TextView)itemView.findViewById(R.id.date);
        rate = (TextView) itemView.findViewById(R.id.rates);

    }
}
