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

public class Card1HoriAdapter2 extends RecyclerView.Adapter<Card1HoriAdapter2.CardViewHolder> {

    ArrayList<com.example.page1diglibtea.Card1Hori2> returned;
    Context context;

    public Card1HoriAdapter2(ArrayList<com.example.page1diglibtea.Card1Hori2> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1hori2,parent,false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        com.example.page1diglibtea.Card1Hori2 currentCards = this.returned.get(position);
        holder.imageForCard.setImageResource(currentCards.getImageForCard());
        holder.zeroText.setText(currentCards.getZeroText());
        holder.subjectText.setText(currentCards.getSubjectText());
        holder.infoText.setText(currentCards.getInfotext());
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageForCard;
        TextView zeroText,subjectText,infoText;



        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForCard=itemView.findViewById(R.id.imageForCardp2);
            zeroText=itemView.findViewById(R.id.zeroTextp2);
            subjectText=itemView.findViewById(R.id.subjectTextp2);
            infoText=itemView.findViewById(R.id.colorTextp2);
        }
    }
}



