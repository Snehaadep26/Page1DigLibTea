package com.example.page1diglibtea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivityP1 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ArrayList<Card1Hori> cardHori;
    ArrayList<Card1Verti> cardVert;
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    Card1HoriAdapter cardHoriAdapter;
    Card1VertiAdapter cardVertiAdapter1,cardVertiAdapter2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainp1);
        createCard();
        buildRecyclerView();
        createCard1();
        buildRecyclerView1();

        createCard2();
        buildRecyclerView3();
        createCard3();
        buildRecyclerView2();




    }
    public void createCard() {
        cardHori=new ArrayList<>();
        cardHori.add(new Card1Hori(R.drawable.notes2l,"0","Lecture Notes"));
        cardHori.add(new Card1Hori(R.drawable.videos,"0","Videos"));
        cardHori.add(new Card1Hori(R.drawable.quebank2,"0","Question banks"));


    }


    public void buildRecyclerView() {

        recyclerView1 = findViewById(R.id.recyler1p1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        cardHoriAdapter = new Card1HoriAdapter(cardHori,MainActivityP1.this);
        recyclerView1.setAdapter(cardHoriAdapter);
    }
    public void createCard1() {
        cardVert=new ArrayList<>();
        cardVert.add(new Card1Verti("AAA","Arts"));
        cardVert.add(new Card1Verti("IVV","Commerce"));
        cardVert.add(new Card1Verti("II","Science"));


    }


    public void createCard2() {
        cardVert=new ArrayList<>();
        cardVert.add(new Card1Verti("A","Arts"));
        cardVert.add(new Card1Verti("B","Commerce"));
        cardVert.add(new Card1Verti("C","Science"));
        cardVert.add(new Card1Verti("D","Science"));


    }
    public void createCard3() {
        cardVert=new ArrayList<>();
        cardVert.add(new Card1Verti("A","Arts"));
        cardVert.add(new Card1Verti("B","Commerce"));
        cardVert.add(new Card1Verti("C","Science"));


    }
    public void buildRecyclerView1() {

        recyclerView2 = findViewById(R.id.recyler2p1);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert,MainActivityP1.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView2() {

        recyclerView2 = findViewById(R.id.recyler5p1);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert,MainActivityP1.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView3() {

        recyclerView2 = findViewById(R.id.recyler4p1);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert,MainActivityP1.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }



}