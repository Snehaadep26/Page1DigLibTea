package com.example.page1diglibtea;

public class RecentQuestionBankCard {
    int recentQBImg;
    String organicQBText,reactionQBText,chemQBText,classQBText;

    public RecentQuestionBankCard(int recentQBImg, String organicQBText, String reactionQBText, String chemQBText, String classQBText) {
        this.recentQBImg = recentQBImg;
        this.organicQBText = organicQBText;
        this.reactionQBText = reactionQBText;
        this.chemQBText = chemQBText;
        this.classQBText = classQBText;
    }

    public int getRecentQBImg() {
        return recentQBImg;
    }

    public String getOrganicQBText() {
        return organicQBText;
    }

    public String getReactionQBText() {
        return reactionQBText;
    }

    public String getChemQBText() {
        return chemQBText;
    }

    public String getClassQBText() {
        return classQBText;
    }
}
