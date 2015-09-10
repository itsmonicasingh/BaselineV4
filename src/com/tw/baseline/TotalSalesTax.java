package com.tw.baseline;

//has item name and item price and returns the total sales tax
public class TotalSalesTax {

    private String itemName;
    private double itemPrice;
    private  int noOfItems;


    public TotalSalesTax(int noOfItems, String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.noOfItems = noOfItems;

    }

    public double calculateTotalTax() {
        BasicTax basicTax = new BasicTax(itemName, itemPrice);
        AdditionalTax additionalTax = new AdditionalTax(itemName, itemPrice);
        return (basicTax.calculateBasicTax() + additionalTax.calculateAdditionalTax());
    }

    public double totalPriceIncludingTax() {
        return 0.0;
    }
}
