package com.example.denemeszlkuygulamas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private Toolbar toolbar;
    private RecyclerView rv;
    private ArrayList<Kelimeler> kelimelerArrayList;
    private KelimelerAdapter adapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= findViewById(R.id.rv);
        toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("Deneme Sözlük");
        setSupportActionBar(toolbar);
        rv.setHasFixedSize(true);
        rv.setLayoutManager( new LinearLayoutManager(this));
        Kelimeler k1 = new Kelimeler(1,"se","et");
        Kelimeler k12 = new Kelimeler(2,"sefdf","et");
        Kelimeler k13= new Kelimeler(3,"sedf","etdf");
        Kelimeler k14 = new Kelimeler(4,"sdde","edft");
        kelimelerArrayList = new ArrayList<>();
        kelimelerArrayList.add(k1);
        kelimelerArrayList.add(k12);
        kelimelerArrayList.add(k13);
        kelimelerArrayList.add(k14);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        MenuItem menuItem = menu.findItem(R.id.searchItem);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.e("onQueryTextSubmit",query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.e("onQueryTextChange",newText);
        return false;
    }
}
