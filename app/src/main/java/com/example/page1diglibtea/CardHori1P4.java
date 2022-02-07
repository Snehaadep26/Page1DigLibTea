package com.example.page1diglibtea;

public class CardHori1P4 {
    int imageForP4Card;
    String zeroP4Text,subjectP4Text,infoP4text;

    public CardHori1P4(int imageForP4Card, String zeroP4Text, String subjectP4Text, String infoP4text) {
        this.imageForP4Card = imageForP4Card;
        this.zeroP4Text = zeroP4Text;
        this.subjectP4Text = subjectP4Text;
        this.infoP4text = infoP4text;
    }

    public int getImageForP4Card() {
        return imageForP4Card;
    }

    public String getZeroP4Text() {
        return zeroP4Text;
    }

    public String getSubjectP4Text() {
        return subjectP4Text;
    }

    public String getInfoP4text() {
        return infoP4text;
    }
}
