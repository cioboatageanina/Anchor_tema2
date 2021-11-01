package com.example.anchor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Discover extends AppCompatActivity {

    private ListView listView;
    private MeniuAdapter meniuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        listView = findViewById(R.id.lstView);
        meniuAdapter = new MeniuAdapter(getCategory());
        listView.setAdapter(meniuAdapter);
        meniuAdapter.UpdateLista(getCategory());
    }

    private List<DiscoverPodcasts> getCategory(){
        List<DiscoverPodcasts> lst = new ArrayList<>();
        lst.add(new DiscoverPodcasts("Music + Talk", "Express yourself with songs from Spotify."));
        lst.add(new DiscoverPodcasts("Making your podcast", "Advice from the Anchor production team."));
        lst.add(new DiscoverPodcasts("Episodes using Anchor tools", "Get inspired by how other podcasters create."));
        lst.add(new DiscoverPodcasts("Amplifying Black Voices", "Hear stories and perspectives from Black creators."));
        return lst;
    }

}