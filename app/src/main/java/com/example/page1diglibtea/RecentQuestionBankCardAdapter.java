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

public class RecentQuestionBankCardAdapter extends RecyclerView.Adapter<RecentQuestionBankCardAdapter.CardViewHolder> {

    ArrayList<RecentQuestionBankCard> returned;
    Context context;

    public RecentQuestionBankCardAdapter(ArrayList<com.example.page1diglibtea.RecentQuestionBankCard> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public RecentQuestionBankCardAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recentlecnotescard,parent,false);
        RecentQuestionBankCardAdapter.CardViewHolder cvh = new RecentQuestionBankCardAdapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecentQuestionBankCardAdapter.CardViewHolder holder, int position) {
        com.example.page1diglibtea.RecentQuestionBankCard currentCards = this.returned.get(position);
        holder.recentQBImg.setImageResource(currentCards.getRecentQBImg());
        holder.organicQBText.setText(currentCards.getOrganicQBText());
        holder.reactionQBText.setText(currentCards.getReactionQBText());
        holder.chemQBText.setText(currentCards.getChemQBText());
        holder.classQBText.setText(currentCards.getClassQBText());
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView recentQBImg;
        TextView organicQBText,reactionQBText,chemQBText,classQBText;



        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            recentQBImg=itemView.findViewById(R.id.recentImgp2);
            organicQBText=itemView.findViewById(R.id.organiChemTextp2);
            reactionQBText=itemView.findViewById(R.id.reactionTextp2);
            chemQBText=itemView.findViewById(R.id.chemistTextp2);
            classQBText=itemView.findViewById(R.id.recentclassTextp2);
        }
    }
}
