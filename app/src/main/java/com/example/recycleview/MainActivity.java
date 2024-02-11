package com.example.recycleview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<CardItem> cardItemList;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cardItemList = new ArrayList<>();

        cardItemList.add(new CardItem(R.drawable.tokyo, "Úrsula Corberó  (Tokyo)", "a runaway turned robber who is scouted by the Professor, then joins his group and participates in his plans."));
        cardItemList.add(new CardItem(R.drawable.professor, "Álvaro Morte  (The Professor)"," the mastermind of the heist who assembled the group, and Berlin's younger brother"));
        cardItemList.add(new CardItem(R.drawable.lisbon, "Itziar Ituño (Lisbon)","an inspector of the National Police Corps who is put in charge of the case"));
        cardItemList.add(new CardItem(R.drawable.berlin, " Pedro Alonso (Berlin)","a terminally ill jewel thief and the Professor's second-in-command and older brother"));
        cardItemList.add(new CardItem(R.drawable.moscow, " Paco Tous (Moscow)","a former miner turned criminal and Denver's father"));
        cardItemList.add(new CardItem(R.drawable.nairobi, "Alba Flores (Nairobi)","an expert in counterfeiting and forgery, in charge of printing the money and oversaw the melting of gold"));
        cardItemList.add(new CardItem(R.drawable.rio, "Miguel Herrán (Rio)","a young hacker who later becomes Tokyo's boyfriend"));
        cardItemList.add(new CardItem(R.drawable.denver, "Jaime Lorente (Denver)","Moscow's son who joins him in the heist"));
        cardItemList.add(new CardItem(R.drawable.stockholm, "Esther Acebo KitKat (Stockholm)","one of the hostages in the Mint who is Arturo Román's secretary and mistress, carrying his child out of wedlock;"));
        cardItemList.add(new CardItem(R.drawable.artur, "Enrique Arce","a hostage and the former Director of the Royal Mint of Spain"));

        adapter = new MyAdapter(cardItemList, this);
        recyclerView.setAdapter(adapter);
    }
}
