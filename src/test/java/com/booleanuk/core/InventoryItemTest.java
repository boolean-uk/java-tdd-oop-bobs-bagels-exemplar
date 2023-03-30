package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class InventoryItemTest {

    @Test
    void testSetSKU() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        theItem.setSKU("BGLOO");
        Assertions.assertEquals("BGLOO", theItem.getSKU());
    }

    @Test
    void testGetSKU() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        Assertions.assertEquals("BGLO", theItem.getSKU());
    }

    @Test
    void testSetPrice() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        theItem.setPrice(0.50);
        Assertions.assertEquals(0.50, theItem.getPrice());
    }

    @Test
    void testGetPrice() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        Assertions.assertEquals(0.49, theItem.getPrice());
    }

    @Test
    void testSetName() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        theItem.setName("Bagels");
        Assertions.assertEquals("Bagels", theItem.getName());
    }

    @Test
    void testGetName() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        Assertions.assertEquals("Bagel", theItem.getName());
    }

    @Test
    void testSetVariant() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        theItem.setVariant("Oniony");
        Assertions.assertEquals("Oniony", theItem.getVariant());
    }

    @Test
    void testGetVariant() {
        InventoryItem theItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");
        Assertions.assertEquals("Onion", theItem.getVariant());
    }
}