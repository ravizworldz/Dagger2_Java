package com.demo.dagger2demo.model;

import java.util.ArrayList;

public class RecyclerList {

    private ArrayList<RecyclerData> items;

    public RecyclerList(ArrayList<RecyclerData> items) {
        this.items = items;
    }

    public ArrayList<RecyclerData> getItems() {
        return items;
    }

    public void setItems(ArrayList<RecyclerData> items) {
        this.items = items;
    }
}
