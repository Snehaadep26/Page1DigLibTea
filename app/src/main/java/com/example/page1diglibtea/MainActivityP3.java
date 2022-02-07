package com.example.page1diglibtea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivityP3 extends AppCompatActivity {
    CardHori1P3Adapter cardHoriP3Adapter;
    ArrayList<CardHori1P3> cardHoriP3;
    CardVer1P3Adapter cardVer1Adapter;
    ArrayList<CardVer1P3> cardVer1p3;
    Toolbar toolbar;
    RecyclerView recyclerViewp31,recyclerViewp32,recyclerViewp33;
    RecyclerView.LayoutManager layoutManagerp31,layoutManagerp32,layoutManagerp33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainp3);
        toolbar=findViewById(R.id.toolbarp3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        createCard();
        buildRecyclerView();

        createCard2();

        buildRecyclerView3();

    }
    public void createCard() {
        cardHoriP3=new ArrayList<>();
        cardHoriP3.add(new CardHori1P3(R.drawable.notes2l,"0","Lecture Notes"));
        cardHoriP3.add(new CardHori1P3(R.drawable.videos,"0","Videos"));
        cardHoriP3.add(new CardHori1P3(R.drawable.quebank2,"0","Question Banks "));


    }


    public void buildRecyclerView() {

        recyclerViewp31 = findViewById(R.id.recyler1forp3);
        recyclerViewp31.setHasFixedSize(true);
        layoutManagerp31 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewp31.setLayoutManager(layoutManagerp31);
        cardHoriP3Adapter = new CardHori1P3Adapter(cardHoriP3,MainActivityP3.this);
        recyclerViewp31.setAdapter(cardHoriP3Adapter);
    }
    public void createCard1()
    {
        cardVer1p3=new ArrayList<>();
        cardVer1p3.add(new CardVer1P3(R.drawable.mathsc1,"Mathematics","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.geographyc3,"Geography","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.businessstudc5,"Business Studies","0 file"));


    }
    public void buildRecyclerView1()
    {
        recyclerViewp32 = findViewById(R.id.recyclerVerP3);
        recyclerViewp32.setHasFixedSize(true);
        layoutManagerp32 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewp32.setLayoutManager(layoutManagerp32);
        cardVer1Adapter = new CardVer1P3Adapter(cardVer1p3,MainActivityP3.this);
        recyclerViewp32.setAdapter(cardVer1Adapter);
    }
    public void createCard2()
    {
        cardVer1p3=new ArrayList<>();
        cardVer1p3.add(new CardVer1P3(R.drawable.mathsc1,"Mathematics ","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.compscic2,"Computer Science","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.geographyc3," Geography","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.botanyc4," Botany","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.businessstudc5," Business Studies","0 file"));
        cardVer1p3.add(new CardVer1P3(R.drawable.accountancyc6," Accountancy","0 file"));


    }

    public void buildRecyclerView3()
    {
        recyclerViewp32 = findViewById(R.id.recyclerVerP3);
        recyclerViewp32.setHasFixedSize(true);
        layoutManagerp32 = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerViewp32.setLayoutManager(layoutManagerp32);
        cardVer1Adapter = new CardVer1P3Adapter(cardVer1p3,MainActivityP3.this);
        recyclerViewp32.setAdapter(cardVer1Adapter);
    }
}