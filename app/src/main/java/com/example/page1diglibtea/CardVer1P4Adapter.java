package com.example.page1diglibtea;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardVer1P4Adapter extends RecyclerView.Adapter<CardVer1P4Adapter.CardViewHolder> {

    ArrayList<CardVer1P4> returned;
    Context context;

    public CardVer1P4Adapter(ArrayList<com.example.page1diglibtea.CardVer1P4> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public CardVer1P4Adapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1verp4 ,parent,false);
        CardVer1P4Adapter.CardViewHolder cvh = new CardVer1P4Adapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardVer1P4Adapter.CardViewHolder holder, int position) {
        com.example.page1diglibtea.CardVer1P4 currentCards = this.returned.get(position);
        holder.imageForVerP4Card.setImageResource(currentCards.getImgForCardVerP4());
        holder.subjTextVerP4.setText(currentCards.getSubjTextVerP4());
        holder.fileTextP4.setText(currentCards.getFileTextVerP4());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,MainActivityP4.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageForVerP4Card;
        TextView subjTextVerP4,fileTextP4;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForVerP4Card=itemView.findViewById(R.id.imageViewVerP4);
            subjTextVerP4=itemView.findViewById(R.id.textSubjP4);
            fileTextP4=itemView.findViewById(R.id.fileTextP4);

        }
    }
}
