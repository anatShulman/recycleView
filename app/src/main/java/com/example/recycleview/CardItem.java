package com.example.recycleview;

public class CardItem {
    private int imageResource;
    private String description;

    private String title;

    public CardItem(int imageResource,String title, String description) {
        this.imageResource = imageResource;
        this.title=title;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
