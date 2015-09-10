package com.tw.baseline;

//has name of item and its cost and returns the basic sales tax
public class BasicTax {
    private String itemName;
    private double itemPrice;

    public BasicTax(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double calculateBasicTax() {
        return 0.0;
    }
}
