package com.example.page1diglibtea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityP4 extends AppCompatActivity {

        ArrayList<CardHori1P4> cardHoriP4;
        CardHori1P4Adapter cardHori1P4Adapter;

        CardVer1P4Adapter cardVer1AdapterP4;
        ArrayList<CardVer1P4> cardVer1p4;
        Toolbar toolbar;
        RecyclerView recyclerViewp41,recyclerViewp42,recyclerViewp33;
        RecyclerView.LayoutManager layoutManagerp41,layoutManagerp42,layoutManagerp33;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mainp4);
            toolbar=findViewById(R.id.toolbarp4);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            createCard();
            buildRecyclerView();
          //  createCard1();
          //  buildRecyclerView1();
            createCard2();

            buildRecyclerView3();

        }
        public void createCard() {
            cardHoriP4=new ArrayList<>();
            cardHoriP4.add(new CardHori1P4(R.drawable.notes2l,"60","Lecture Notes","+100 from last week"));
            cardHoriP4.add(new CardHori1P4(R.drawable.videos,"24","Videos",""));
            cardHoriP4.add(new CardHori1P4(R.drawable.quebank2,"63","Question Banks ","-50 from last week"));


        }


        public void buildRecyclerView() {

            recyclerViewp41 = findViewById(R.id.recyler1forp4);
            recyclerViewp41.setHasFixedSize(true);
            layoutManagerp41 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            recyclerViewp41.setLayoutManager(layoutManagerp41);
            cardHori1P4Adapter = new CardHori1P4Adapter(cardHoriP4,MainActivityP4.this);
            recyclerViewp41.setAdapter(cardHori1P4Adapter);
        }


        public void createCard2()
        {
            cardVer1p4=new ArrayList<>();
            cardVer1p4.add(new CardVer1P4(R.drawable.mathsc1,"Mathematics ","56 file"));
            cardVer1p4.add(new CardVer1P4(R.drawable.compscic2,"Computer Science","102 file"));
            cardVer1p4.add(new CardVer1P4(R.drawable.geographyc3," Geography","234 file"));
            cardVer1p4.add(new CardVer1P4(R.drawable.botanyc4," Botany","0 file"));
            cardVer1p4.add(new CardVer1P4(R.drawable.businessstudc5," Business Studies","12 file"));
            cardVer1p4.add(new CardVer1P4(R.drawable.accountancyc6," Accountancy","73 file"));


        }

        public void buildRecyclerView3()
        {
            recyclerViewp42 = findViewById(R.id.recyclerVerP4);
            recyclerViewp42.setHasFixedSize(true);
            layoutManagerp42 = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
            recyclerViewp42.setLayoutManager(layoutManagerp42);
            cardVer1AdapterP4 = new CardVer1P4Adapter(cardVer1p4,MainActivityP4.this);
            recyclerViewp42.setAdapter(cardVer1AdapterP4);
        }

    }