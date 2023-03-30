package com.booleanuk.core;


public class InventoryItem {

    private String SKU;
    private double price;
    private String name;
    private String variant;

    public InventoryItem(String SKU, double price, String name, String variant) {
        this.SKU = SKU;
        this.price = price;
        this.name = name;
        this.variant = variant;
    }

    public InventoryItem(InventoryItem otherItem) {
        this.SKU = otherItem.getSKU();
        this.price = otherItem.getPrice();
        this.name = otherItem.getName();
        this.variant = otherItem.getVariant();
    }

    public void setSKU (String newSKU) {
        this.SKU = newSKU;
    }

    public String getSKU() {
        return this.SKU;
    }

    public void setPrice (double newPrice) {
        this.price = newPrice;
    }

    public double getPrice () {
        return this.price;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public String getName () {
        return this.name;
    }


    public void setVariant (String newVariant) {
        this.variant = newVariant;
    }


    public String getVariant () {
        return this.variant;
    }

    public String toString() {
        return "[SKU: " + this.SKU + ", Price: " + this.price + ", Name: " + this.variant + " " + this.name + "]";
    }

}
