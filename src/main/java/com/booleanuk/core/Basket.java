package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    private ArrayList<InventoryItem> contents;
    private int capacity;
    private HashMap<String, InventoryItem> stock;

    public Basket (int capacity) {
        this.capacity = capacity;
        this.contents = new ArrayList<>();
        this.stock = new HashMap<>();
        this.stock.put("BGLO", new InventoryItem("BGLO", 0.49, "Bagel", "Onion"));
        this.stock.put("BGLP", new InventoryItem("BGLP", 0.39, "Bagel", "Onion"));
        this.stock.put("BGLS", new InventoryItem("BGLS", 0.49, "Bagel", "Onion"));
        this.stock.put("COFB", new InventoryItem("COFB", 0.99, "Coffee", "Black"));
        this.stock.put("COFW", new InventoryItem("COFW", 1.19, "Coffee", "White"));
        this.stock.put("COFC", new InventoryItem("COFC", 1.29, "Coffee", "Cappuccino"));
        this.stock.put("COFL", new InventoryItem("COFL", 1.29, "Coffee", "Latte"));
        this.stock.put("FILB", new InventoryItem("FILB", 0.12, "Filling", "Bacon"));
        this.stock.put("FILE", new InventoryItem("FILE", 0.12, "Filling", "Egg"));
        this.stock.put("FILC", new InventoryItem("FILC", 0.12, "Filling", "Cheese"));
        this.stock.put("FILX", new InventoryItem("FILX", 0.12, "Filling", "Cream Cheese"));
        this.stock.put("FILS", new InventoryItem("FILS", 0.12, "Filling", "Smoked Salmon"));
        this.stock.put("FILH", new InventoryItem("FILH", 0.12, "Filling", "Ham"));
    }

    // This method probably doesn't need to be here as we also have resizeBasket
    public void setCapacity (int newCapacity) {
        this.capacity = newCapacity;
    }


    public String add(String itemSKU) {
        if (this.stock.containsKey(itemSKU)) {
            if (this.contents.size() < this.getCapacity()) {
                this.contents.add(new InventoryItem(this.stock.get(itemSKU)));
                return "Successfully added " + this.stock.get(itemSKU).getVariant() + " " + this.stock.get(itemSKU).getName() + " to basket.";
            } else {
                return "Unable to add " + this.stock.get(itemSKU).getVariant() + " " + this.stock.get(itemSKU).getName() + " to basket as it is full.";
            }
        }
        return "Unable to add item with SKU " + itemSKU + " to basket as we don't stock those.";
    }

    public String remove(String itemSKU) {
        if (this.stock.containsKey(itemSKU)) {
            for (InventoryItem item : this.contents) {
                if (item.getSKU().equals(itemSKU)) {
                    this.contents.remove(item);
                    return "Successfully removed " + this.stock.get(itemSKU).getVariant() + " " + this.stock.get(itemSKU).getName() + " from basket.";
                }
            }
            return "Unable to remove " +this.stock.get(itemSKU).getVariant() + " " + this.stock.get(itemSKU).getName()  + " as you haven't added it to the basket.";
        }
        return "Unable to remove item with the SKU " + itemSKU + " as we don't recognise that code.";
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
        double total = 0.0;
        for (InventoryItem item : this.contents) {
            total += item.getPrice();
        }
        return total;
    }

    public String toString() {
        String details = "";
        for (InventoryItem item : this.contents) {
            details += item.toString() + "\n";
        }

        return details;
    }
}
