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

public class RecentLectureNotesCardAdapter extends RecyclerView.Adapter<RecentLectureNotesCardAdapter.CardViewHolder> {

    ArrayList<RecentLectureNotesCard> returned;
    Context context;

    public RecentLectureNotesCardAdapter(ArrayList<com.example.page1diglibtea.RecentLectureNotesCard> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public RecentLectureNotesCardAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recentlecnotescard,parent,false);
        RecentLectureNotesCardAdapter.CardViewHolder cvh = new RecentLectureNotesCardAdapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecentLectureNotesCardAdapter.CardViewHolder holder, int position) {
        com.example.page1diglibtea.RecentLectureNotesCard currentCards = this.returned.get(position);
        holder.recentImg.setImageResource(currentCards.getRecentImg());
        holder.organicText.setText(currentCards.getOrganicText());
        holder.reactionText.setText(currentCards.getReactionText());
        holder.chemText.setText(currentCards.getChemText());
        holder.classText.setText(currentCards.getClassText());
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView recentImg;
        TextView organicText,reactionText,chemText,classText;



        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            recentImg=itemView.findViewById(R.id.recentImgp2);
            organicText=itemView.findViewById(R.id.organiChemTextp2);
            reactionText=itemView.findViewById(R.id.reactionTextp2);
            chemText=itemView.findViewById(R.id.chemistTextp2);
            classText=itemView.findViewById(R.id.recentclassTextp2);
        }
    }
}
