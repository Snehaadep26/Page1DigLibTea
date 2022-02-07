package com.example.page1diglibtea;

public class Card1Hori2 {
        int imageForCard;
        String zeroText,subjectText,infotext;

        public Card1Hori2(int imageForCard, String zeroText, String subjectText, String infotext) {
            this.imageForCard = imageForCard;
            this.zeroText = zeroText;
            this.subjectText = subjectText;
            this.infotext=infotext;
        }

        public int getImageForCard() {
            return imageForCard;
        }

        public String getZeroText() {
            return zeroText;
        }

        public String getSubjectText() {
            return subjectText;
        }
        public String getInfotext(){
            return  infotext;
        }
    }



