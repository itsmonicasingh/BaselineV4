package com.tw.baseline;

//has item name and item price and returns the total sales tax
public class TotalSalesTax {

    private String itemName;
    private double itemPrice;

    public TotalSalesTax(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double calculateTotalTax() {
        BasicTax basicTax = new BasicTax(itemName, itemPrice);
        return (basicTax.calculateBasicTax());
    }
}
