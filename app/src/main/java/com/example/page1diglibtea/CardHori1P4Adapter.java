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

public class CardHori1P4Adapter extends RecyclerView.Adapter<CardHori1P4Adapter.CardViewHolder> {

    ArrayList<com.example.page1diglibtea.CardHori1P4> returned;
    Context context;

    public CardHori1P4Adapter(ArrayList<com.example.page1diglibtea.CardHori1P4> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1horip4,parent,false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        com.example.page1diglibtea.CardHori1P4 currentCards = this.returned.get(position);
        holder.imageForp4Card.setImageResource(currentCards.getImageForP4Card());
        holder.zerop4Text.setText(currentCards.getZeroP4Text());
        holder.subjectp4Text.setText(currentCards.getSubjectP4Text());
        holder.infop4Text.setText(currentCards.getInfoP4text());
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageForp4Card;
        TextView zerop4Text,subjectp4Text,infop4Text;



        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForp4Card=itemView.findViewById(R.id.imageForCardP4);
            zerop4Text=itemView.findViewById(R.id.zeroTextP4);
            subjectp4Text=itemView.findViewById(R.id.subjectTextCardP4);
            infop4Text=itemView.findViewById(R.id.colorTextp4);
        }
    }
}



