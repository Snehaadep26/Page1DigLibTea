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

public class CardVer1P3Adapter extends RecyclerView.Adapter<CardVer1P3Adapter.CardViewHolder> {

    ArrayList<CardVer1P3> returned;
    Context context;

    public CardVer1P3Adapter(ArrayList<com.example.page1diglibtea.CardVer1P3> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public CardVer1P3Adapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardver1p3 ,parent,false);
        CardVer1P3Adapter.CardViewHolder cvh = new CardVer1P3Adapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardVer1P3Adapter.CardViewHolder holder, int position) {
        com.example.page1diglibtea.CardVer1P3 currentCards = this.returned.get(position);
        holder.imageForVerP3Card.setImageResource(currentCards.getImgForCardVerP3());
        holder.subjTextVerP3.setText(currentCards.getSubjTextVerP3());
        holder.fileTextP3.setText(currentCards.getFileTextVerP3());
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

        ImageView imageForVerP3Card;
        TextView subjTextVerP3,fileTextP3;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForVerP3Card=itemView.findViewById(R.id.imageViewVerP3);
            subjTextVerP3=itemView.findViewById(R.id.textSubjP3);
            fileTextP3=itemView.findViewById(R.id.fileTextP3);

        }
    }
}
