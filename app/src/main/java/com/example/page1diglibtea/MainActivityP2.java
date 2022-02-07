package com.example.page1diglibtea;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityP2 extends AppCompatActivity {
    ArrayList<Card1Hori2> cardHori2;
    ArrayList<Card1Verti2> cardVert2;
    ArrayList<RecentLectureNotesCard> recentCard;
    RecentLectureNotesCardAdapter recentAdapter;
    ArrayList<RecentVideosCard> recentVidCard;
    RecentVideosCardAdapter recentVidAdapter;
    ArrayList<RecentQuestionBankCard> recentQBCard;
    RecentQuestionBankCardAdapter recentQBCardAdapter;
    RecyclerView recyclerViewp21,recyclerViewp22,recyclerViewp23,recyclerViewp24,recyclerViewp25;
    Card1HoriAdapter2 cardHoriAdapter2;
    Card1VertiAdapter2 cardVertiAdapter2;
    RecyclerView.LayoutManager layoutManagerp21,layoutManagerp22,layoutManagerp23,layoutManagerp24,layoutManagerp25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainp2);
        createCard();
        buildRecyclerView();
        createCard4();
        buildRecyclerView4();
        createCard5();
        buildRecyclerView5();
        createCard6();
        buildRecyclerView6();
        createCard1();
        buildRecyclerView1();

        createCard2();
        buildRecyclerView3();
        createCard3();
        buildRecyclerView2();





    }
    public void createCard() {
        cardHori2=new ArrayList<>();
        cardHori2.add(new Card1Hori2(R.drawable.notes2l,"60","Lecture Notes","+100 from last week"));
        cardHori2.add(new Card1Hori2(R.drawable.videos,"24","Videos",""));
        cardHori2.add(new Card1Hori2(R.drawable.quebank2,"63","Question banks","-50 from last week"));


    }


    public void buildRecyclerView() {

        recyclerViewp21 = findViewById(R.id.recyler1p2);
        recyclerViewp21.setHasFixedSize(true);
        layoutManagerp21 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewp21.setLayoutManager(layoutManagerp21);
        cardHoriAdapter2 = new Card1HoriAdapter2(cardHori2,MainActivityP2.this);
        recyclerViewp21.setAdapter(cardHoriAdapter2);
    }
    public void createCard1() {
        cardVert2=new ArrayList<>();
        cardVert2.add(new Card1Verti2("A","Arts"));
        cardVert2.add(new Card1Verti2("B","Commerce"));
        cardVert2.add(new Card1Verti2("C","Science"));


    }


    public void createCard2() {
        cardVert2=new ArrayList<>();
        cardVert2.add(new Card1Verti2("A","Arts"));
        cardVert2.add(new Card1Verti2("B","Commerce"));
        cardVert2.add(new Card1Verti2("C","Science"));
        cardVert2.add(new Card1Verti2("D","Science"));


    }
    public void createCard3() {
        cardVert2=new ArrayList<>();
        cardVert2.add(new Card1Verti2("A","Arts"));
        cardVert2.add(new Card1Verti2("B","Commerce"));
        cardVert2.add(new Card1Verti2("C","Science"));


    }
    public void buildRecyclerView1() {

        recyclerViewp22 = findViewById(R.id.recylerp2);
        recyclerViewp22.setHasFixedSize(true);
        layoutManagerp22 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewp22.setLayoutManager(layoutManagerp22);
        cardVertiAdapter2 = new Card1VertiAdapter2(cardVert2,MainActivityP2.this);
        recyclerViewp22.setAdapter(cardVertiAdapter2);
    }
    public void buildRecyclerView2() {

        recyclerViewp22 = findViewById(R.id.recyler5p2);
        recyclerViewp22.setHasFixedSize(true);
        layoutManagerp22 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewp22.setLayoutManager(layoutManagerp22);
        cardVertiAdapter2 = new Card1VertiAdapter2(cardVert2,MainActivityP2.this);
        recyclerViewp22.setAdapter(cardVertiAdapter2);
    }
    public void buildRecyclerView3() {

        recyclerViewp22 = findViewById(R.id.recyler4p2);
        recyclerViewp22.setHasFixedSize(true);
        layoutManagerp22 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewp22.setLayoutManager(layoutManagerp22);
        cardVertiAdapter2 = new Card1VertiAdapter2(cardVert2,MainActivityP2.this);
        recyclerViewp22.setAdapter(cardVertiAdapter2);
    }

    public void createCard4()
    {
        recentCard=new ArrayList<>();
        recentCard.add((new RecentLectureNotesCard(R.drawable.recentchemistry,"Organic Chemistry","Reaction Intermediates","Chemistry","10th-A")));
        recentCard.add((new RecentLectureNotesCard(R.drawable.recentcomputerscience,"[Chapter name]","[Topic name]","[Subject]","[Class - Section]")));
    }
    public void buildRecyclerView4()
    {
        recyclerViewp23=findViewById(R.id.recentRecyclerp2);
        recyclerViewp23.setHasFixedSize(true);
        layoutManagerp23 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewp23.setLayoutManager(layoutManagerp23);
        recentAdapter = new RecentLectureNotesCardAdapter(recentCard,MainActivityP2.this);
        recyclerViewp23.setAdapter(recentAdapter);
    }
    public void createCard5()
    {
        recentVidCard=new ArrayList<>();
        recentVidCard.add((new RecentVideosCard(R.drawable.mapchem,"Organic Chemistry","Reaction Intermediate","Chemistry","10th-A")));
        recentVidCard.add((new RecentVideosCard(R.drawable.mapchem,"Organic Chemistry","Reaction Intermediate","Chemistry","10th-A")));
    }
    public void buildRecyclerView5()
    {
        recyclerViewp24=findViewById(R.id.recntVidRecyp2);
        recyclerViewp24.setHasFixedSize(true);
        layoutManagerp24 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewp24.setLayoutManager(layoutManagerp24);
        recentVidAdapter = new RecentVideosCardAdapter(recentVidCard,MainActivityP2.this);
        recyclerViewp24.setAdapter(recentVidAdapter);
    }
    public void createCard6()
    {
        recentQBCard=new ArrayList<>();
        recentQBCard.add((new RecentQuestionBankCard(R.drawable.botanyqb,"Organic Chemistry","Reaction Intermediates","Botany","10th-A")));
        recentQBCard.add((new RecentQuestionBankCard(R.drawable.computersqb,"Organic Chemistry","Reaction Intermediates","Computer Science","10th-A")));
        recentQBCard.add((new RecentQuestionBankCard(R.drawable.businessqb,"Organic Chemistry","Reaction Intermediates","Business Studies","10th-A")));

    }
    public void buildRecyclerView6()
    {
        recyclerViewp25=findViewById(R.id.RecyclerqueBankP2);
        recyclerViewp25.setHasFixedSize(true);
        layoutManagerp25 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewp25.setLayoutManager(layoutManagerp25);
        recentQBCardAdapter = new RecentQuestionBankCardAdapter(recentQBCard,MainActivityP2.this);
        recyclerViewp25.setAdapter(recentQBCardAdapter);
    }

}