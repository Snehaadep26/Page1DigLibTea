package com.example.page1diglibtea;

public class RecentLectureNotesCard {
    int recentImg;
    String organicText,reactionText,chemText,classText;

    public RecentLectureNotesCard(int recentImg, String organicText, String reactionText, String chemText, String classText) {
        this.recentImg = recentImg;
        this.organicText = organicText;
        this.reactionText = reactionText;
        this.chemText = chemText;
        this.classText = classText;
    }

    public int getRecentImg() {
        return recentImg;
    }

    public String getOrganicText() {
        return organicText;
    }

    public String getReactionText() {
        return reactionText;
    }

    public String getChemText() {
        return chemText;
    }

    public String getClassText() {
        return classText;
    }
}
