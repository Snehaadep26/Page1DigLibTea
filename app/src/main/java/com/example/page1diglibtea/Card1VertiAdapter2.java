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

public class Card1VertiAdapter2 extends RecyclerView.Adapter<Card1VertiAdapter2.MyViewHolder> {


    ArrayList<com.example.page1diglibtea.Card1Verti2> name;
    Context context;

    public Card1VertiAdapter2(ArrayList<com.example.page1diglibtea.Card1Verti2> name,Context context)
    {

        this.name = name;
        this.context=context;
    }



    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card1verti2,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull MyViewHolder holder, int position) {
        com.example.page1diglibtea.Card1Verti2 currentMath = name.get(position);

        holder.AText.setText(currentMath.getAText());
        holder.neetText.setText(currentMath.getNeetText());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, MainActivityP3.class);
                context.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount()
    {
        return name.size();
    }






    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView AText,neetText;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            AText=itemView.findViewById(R.id.Atextp2);
            neetText=itemView.findViewById(R.id.neetTextp2);


        }
    }
}