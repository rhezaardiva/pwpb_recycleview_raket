package org.sandec.tugasrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvRackets;
    private ArrayList<Racket> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRackets = findViewById(R.id.rv_racket);
        rvRackets.setHasFixedSize(true);

        list.addAll(RacketsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvRackets.setLayoutManager(new LinearLayoutManager(this));
        ListRacketAdapter listHeroAdapter = new ListRacketAdapter(list);
        rvRackets.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecylerCardView(){
        rvRackets.setLayoutManager(new LinearLayoutManager(this));
        CardViewRacketAdapter cardViewHeroAdapter = new CardViewRacketAdapter(list);
        rvRackets.setAdapter(cardViewHeroAdapter);
    }

    private void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_cardview:
                showRecylerCardView();
                break;
        }
    }
}
