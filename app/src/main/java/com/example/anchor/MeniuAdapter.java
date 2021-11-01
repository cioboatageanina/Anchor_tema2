package com.example.anchor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MeniuAdapter extends BaseAdapter {

    private List<DiscoverPodcasts> podcasts;

    public MeniuAdapter(List<DiscoverPodcasts> lista) {
        this.podcasts = lista;
    }

    @Override
    public int getCount() {
        return podcasts.size();
    }

    @Override
    public Object getItem(int position) {
        return podcasts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater infl = LayoutInflater.from(parent.getContext());
        View itemView = infl.inflate(R.layout.item_podcasts, parent, false);
        TextView tv_Category = itemView.findViewById(R.id.tv_Category);
        TextView tv_Description = itemView.findViewById(R.id.tv_Description);
        DiscoverPodcasts current = podcasts.get(position);
        tv_Category.setText(current.getCategory());
        tv_Description.setText(current.getDescription());
        return itemView;
    }

    public void UpdateLista(List<DiscoverPodcasts> lista_noua)
    {
        this.podcasts.clear();
        this.podcasts.addAll(lista_noua);
        notifyDataSetChanged();

    }


}
