package com.example.page1diglibtea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardHori1P3Adapter extends RecyclerView.Adapter<CardHori1P3Adapter.CardViewHolder> {

    ArrayList<CardHori1P3> returned;
    Context context;

    public CardHori1P3Adapter(ArrayList<com.example.page1diglibtea.CardHori1P3> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public CardHori1P3Adapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardhori1p3 ,parent,false);
        CardHori1P3Adapter.CardViewHolder cvh = new CardHori1P3Adapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardHori1P3Adapter.CardViewHolder holder, int position) {
        com.example.page1diglibtea.CardHori1P3 currentCards = this.returned.get(position);
        holder.imageForP3Card.setImageResource(currentCards.getImageForP3Card());
        holder.zeroP3Text.setText(currentCards.getZeroP3Text());
        holder.subjectP3Text.setText(currentCards.getSubjectP3Text());
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageForP3Card;
        TextView zeroP3Text,subjectP3Text;



        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForP3Card=itemView.findViewById(R.id.imageForCardP3);
            zeroP3Text=itemView.findViewById(R.id.zeroTextP3);
            subjectP3Text=itemView.findViewById(R.id.subjectTextCardP3);

        }
    }
}




