package com.booleanuk.core;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(5);
        // 1. Add a bagel to the basket
        System.out.println("1:");
        System.out.println(basket.add("BGLO"));
        System.out.println(basket.add("BGLP"));
        System.out.println(basket.add("BGLE"));
        System.out.println(basket.add("BGLS"));
        System.out.println(basket);

        // 2. Remove a bagel that was previously added
        System.out.println("\n2:");
        System.out.println(basket.remove("BGLS"));
        System.out.println(basket);

        // 3. When the basket is full tell me I can't add any more
        System.out.println("\n3:");
        System.out.println(basket.add("COFW"));
        System.out.println(basket.add("COFB"));
        System.out.println(basket.add("COFC"));
        System.out.println(basket);

        // 4. Change the capacity of the basket
        System.out.println("\n4:");
        System.out.println(basket.resizeBasket(3));
        System.out.println(basket);
        // DONE: Add code to test and deal with resizing the basket smaller when it already contains items.

        // 5. Get an error if I try to remove a non-existent item
        System.out.println("\n5:");
        System.out.println(basket.resizeBasket(5));
        System.out.println(basket.remove("FILH"));
        System.out.println(basket);

        // 6. See the total cost of the items in my basket
        System.out.println("\n6:");
        System.out.println(basket.getTotalCost());
        System.out.println(basket);

        // 7. Get the cost of an item before adding it to the basket
        System.out.println("\n7:");
        System.out.println(basket.getCost("FILC"));
        System.out.println(basket.remove("COFB"));

        // 8. Add a filling to my bagel/basket
        System.out.println("\n8:");
        System.out.println(basket.add("FILC"));
        System.out.println(basket);

        // 9. Get the cost of a filling
        System.out.println("\n9:");
        System.out.println(basket.getCost("FILC"));

        // 10. Restrict orders to only things which are stocked
        System.out.println("\n10:");
        System.out.println(basket.add("DAVE"));

    }

}
