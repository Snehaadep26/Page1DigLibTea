package com.example.page1diglibtea;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecentVideosCardAdapter extends RecyclerView.Adapter<RecentVideosCardAdapter.CardViewHolder> {

 ArrayList<RecentVideosCard> recentVidCard;
 Context context;

    public RecentVideosCardAdapter(ArrayList<RecentVideosCard> recentVidCard, Context context) {
        this.recentVidCard=recentVidCard;
        this.context=context;
    }

    @NonNull
    @Override
    public RecentVideosCardAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recentvideocard,parent,false);
        RecentVideosCardAdapter.CardViewHolder cvh=new RecentVideosCardAdapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        RecentVideosCard currentVCard=this.recentVidCard.get(position);
        holder.imgVid.setImageResource(currentVCard.getVidImg());
        holder.organicVText.setText(currentVCard.getOrganicVText());
        holder.reactionVText.setText(currentVCard.getReactionVText());
        holder.chemVText.setText(currentVCard.getChemVText());
        holder.classVText.setText(currentVCard.getClassVText());

    }

    @Override
    public int getItemCount() {
        return recentVidCard.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder{

        ImageView imgVid;
        TextView organicVText,reactionVText,chemVText,classVText;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgVid=itemView.findViewById(R.id.VideImgP2);
            organicVText=itemView.findViewById(R.id.organiChemTextVp2);
            reactionVText=itemView.findViewById(R.id.reactionTextVp2);
            chemVText=itemView.findViewById(R.id.chemistTextVp2);
            classVText=itemView.findViewById(R.id.recentclassTextVp2);

        }
    }

}