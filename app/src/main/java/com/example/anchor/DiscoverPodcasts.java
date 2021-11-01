package com.example.anchor;

import android.widget.ImageView;

public class DiscoverPodcasts {
    private String category;
    private String description;

    public DiscoverPodcasts(String category, String description) {
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DiscoverPodcasts{" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
