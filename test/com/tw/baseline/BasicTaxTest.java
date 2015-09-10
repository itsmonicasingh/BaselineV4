package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicTaxTest {

    @Test
    public void shouldReturnZeroIfPriceIsZero() {
        BasicTax basicTax = new BasicTax("I am free", 0.0);

        assertEquals(0.0, basicTax.calculateBasicTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroIfItemIsInExemptedCategoryExampleBook() {
        BasicTax basicSalesTax = new BasicTax("book", 10.0);

        assertEquals(0.0, basicSalesTax.calculateBasicTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroIfItemIsInExpemtedCategoryExampleChocolateBar() {
        BasicTax basicSalesTax = new BasicTax("chocolate bar", 10.0);

        assertEquals(0.0, basicSalesTax.calculateBasicTax(), 0.0d);
    }

}
