package com.tw.baseline;

//has item name and item price and returns additional tax
public class AdditionalTax {

    private String itemName;
    private Double itemPrice;

    public AdditionalTax(String itemName, Double itemPrice) {

        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    private boolean isImported() {
        if (itemName.contains("imported")) {
            return true;
        } else
            return false;
    }

    public double calculateAdditionalTax() {
        if (!this.isImported())
            return 0.0;
        return 0.0;
    }
}
