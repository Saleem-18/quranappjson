package com.example.quranappjson;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class
MainActivity extends AppCompatActivity {
    private RecyclerView quranRecyclerView;
    private QuranAdapter quranAdapter;
    private List<QuranData> quranList;
    private List<QuranData> surahList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quranRecyclerView = findViewById(R.id.quran_recycler_view);
        quranRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        quranList = new ArrayList<>();
        quranAdapter = new QuranAdapter(quranList);
        quranRecyclerView.setAdapter(quranAdapter);

        InputStream inputStream = getResources().openRawResource(R.raw.qurandata);
        JsonReader reader = new JsonReader(new InputStreamReader(inputStream));

        Gson gson = new Gson();
        QuranData[] quranArray = gson.fromJson(reader, QuranData[].class);

        for (QuranData quranData : quranArray) {
            quranList.add(quranData);

        }
        Log.d("asd",quranList.get(0).toString());
        quranAdapter.notifyDataSetChanged();
    }
}

/*
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private RecyclerView recyclerView;
    private List<Translation> translations;
    private QuranAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_translations);
        recyclerView = findViewById(R.id.recycler_view);

        translations = new ArrayList<>();
        translations.add(new Translation("English", "en"));
        translations.add(new Translation("Arabic", "ar"));

        ArrayAdapter<Translation> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, translations);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        adapter = new QuranAdapter(this, translations);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
*/
