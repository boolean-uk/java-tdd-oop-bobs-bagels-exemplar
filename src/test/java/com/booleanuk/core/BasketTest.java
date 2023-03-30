package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BasketTest {

    @Test
    void testSetCapacity() {
        Basket basket = new Basket(5);
        basket.setCapacity(10);
        Assertions.assertEquals(10, basket.getCapacity());
    }

    @Test
    void testGetCapacity() {
        Basket basket = new Basket(5);
        Assertions.assertEquals(5, basket.getCapacity());
    }

    @Test
    void testAdd() {
        Basket basket = new Basket(2);
        Assertions.assertEquals("Successfully added Onion Bagel to basket.", basket.add("BGLO"));
        String basketString = "[SKU: BGLO, Price: 0.49, Name: Onion Bagel]\n";
        Assertions.assertEquals(basketString, basket.toString());
        Assertions.assertEquals("Successfully added Latte Coffee to basket.", basket.add("COFL"));
        basketString += "[SKU: COFL, Price: 1.29, Name: Latte Coffee]\n";
        Assertions.assertEquals(basketString, basket.toString());
        Assertions.assertEquals("Unable to add Ham Filling to basket as it is full.", basket.add("FILH"));
        Assertions.assertEquals("Unable to add item with SKU XXXX to basket as we don't stock those.", basket.add("XXXX"));
    }

    @Test
    void testRemove() {
    }

    @Test
    void testResizeBasket() {
        Basket basket = new Basket(5);
        String result = basket.resizeBasket(10);
        Assertions.assertEquals("Successfully resized the basket to 10 items", result);
        Assertions.assertEquals(10, basket.getCapacity());
    }

    @Test
    void testGetCost() {
        /*
            | BGLO | 0.49  | Bagel   | Onion         |
            | BGLP | 0.39  | Bagel   | Plain         |
            | BGLS | 0.49  | Bagel   | Sesame        |
            | COFB | 0.99  | Coffee  | Black         |
            | COFW | 1.19  | Coffee  | White         |
            | COFC | 1.29  | Coffee  | Capuccino     |
            | COFL | 1.29  | Coffee  | Latte         |
            | FILB | 0.12  | Filling | Bacon         |
            | FILE | 0.12  | Filling | Egg           |
            | FILC | 0.12  | Filling | Cheese        |
            | FILX | 0.12  | Filling | Cream Cheese  |
            | FILS | 0.12  | Filling | Smoked Salmon |
            | FILH | 0.12  | Filling | Ham           |
         */
        Basket basket = new Basket(5);
        Assertions.assertEquals(0.49, basket.getCost("BGLO"));
        Assertions.assertEquals(0.39, basket.getCost("BGLP"));
        Assertions.assertEquals(0.49, basket.getCost("BGLS"));
        Assertions.assertEquals(0.99, basket.getCost("COFB"));
        Assertions.assertEquals(1.19, basket.getCost("COFW"));
        Assertions.assertEquals(1.29, basket.getCost("COFC"));
        Assertions.assertEquals(1.29, basket.getCost("COFL"));
        Assertions.assertEquals(0.12, basket.getCost("FILB"));
        Assertions.assertEquals(0.12, basket.getCost("FILE"));
        Assertions.assertEquals(0.12, basket.getCost("FILC"));
        Assertions.assertEquals(0.12, basket.getCost("FILX"));
        Assertions.assertEquals(0.12, basket.getCost("FILS"));
        Assertions.assertEquals(0.12, basket.getCost("FILH"));
        // Check it can cope with non-existent SKUs
        Assertions.assertEquals(-1.0, basket.getCost("XXXX"));
    }

    @Test
    void testGetTotalCost() {
    }
}