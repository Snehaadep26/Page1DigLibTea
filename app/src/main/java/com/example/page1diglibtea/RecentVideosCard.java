package com.example.page1diglibtea;

public class RecentVideosCard {
    int vidImg;
    String organicVText,reactionVText,chemVText,classVText;

    public RecentVideosCard(int vidImg, String organicVText, String reactionVText, String chemVText, String classVText) {
        this.vidImg = vidImg;
        this.organicVText = organicVText;
        this.reactionVText = reactionVText;
        this.chemVText = chemVText;
        this.classVText = classVText;
    }

    public int getVidImg() {
        return vidImg;
    }

    public String getOrganicVText() {
        return organicVText;
    }

    public String getReactionVText() {
        return reactionVText;
    }

    public String getChemVText() {
        return chemVText;
    }

    public String getClassVText() {
        return classVText;
    }
}
