package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private ArrayList<String> list = new ArrayList<>(List.of("Bread", "Milk", "Eggs", "Butter"));

    public String getFirstItem() {
        return list.getFirst();
    }

    public String getLastItem() {
        return list.getLast();
    }

}
