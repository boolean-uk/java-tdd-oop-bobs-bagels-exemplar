package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    private ArrayList<InventoryItem> contents;
    private int capacity;
    private HashMap<String, InventoryItem> stock;

    public Basket (int capacity) {
        this.capacity = capacity;
        stock = new HashMap<>();
        stock.put("BGLO", new InventoryItem("BGLO", 0.49, "Bagel", "Onion"));
        stock.put("BGLP", new InventoryItem("BGLP", 0.39, "Bagel", "Onion"));
        stock.put("BGLS", new InventoryItem("BGLS", 0.49, "Bagel", "Onion"));
        stock.put("COFB", new InventoryItem("COFB", 0.99, "Coffee", "Black"));
        stock.put("COFW", new InventoryItem("COFW", 1.19, "Coffee", "White"));
        stock.put("COFC", new InventoryItem("COFC", 1.29, "Coffee", "Cappuccino"));
        stock.put("COFL", new InventoryItem("COFL", 1.29, "Coffee", "Latte"));
        stock.put("FILB", new InventoryItem("FILB", 0.12, "Filling", "Bacon"));
        stock.put("FILE", new InventoryItem("FILE", 0.12, "Filling", "Egg"));
        stock.put("FILC", new InventoryItem("FILC", 0.12, "Filling", "Cheese"));
        stock.put("FILX", new InventoryItem("FILX", 0.12, "Filling", "Cream Cheese"));
        stock.put("FILS", new InventoryItem("FILS", 0.12, "Filling", "Smoked Salmon"));
        stock.put("FILH", new InventoryItem("FILH", 0.12, "Filling", "Ham"));
    }

    // This method probably doesn't need to be here as we also have resizeBasket
    public void setCapacity (int newCapacity) {
        this.capacity = newCapacity;
    }


    public String add(String itemSKU) {
        return "";
    }

    public String remove(String itemSKU) {
        return "";
    }

    public String resizeBasket(int newCapacity) {
        this.setCapacity(newCapacity);
        return "Successfully resized the basket to " + newCapacity + " items";
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getCost(String itemSKU) {
        if (this.stock.containsKey(itemSKU)) {
            return this.stock.get(itemSKU).getPrice();
        } else {
            System.out.println("We don't stock that item.");
            return -1.0;
        }
    }

    public double getTotalCost() {
        return 0.0;
    }

    public String toString() {
        String details = "";
        for (InventoryItem item : this.contents) {
            details += item.toString() + "\n";
        }
        return details;
    }
}
