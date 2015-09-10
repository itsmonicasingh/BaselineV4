package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TotalSalesTaxTest {

    @Test
    public void shouldReturnTotalTaxAsZeroIfNoItemIsPurchased() {
        TotalSalesTax totalSalesTax = new TotalSalesTax("item 1", 0.0);

        assertEquals(0.0, totalSalesTax.calculateTotalTax(), 0.0d);
    }

    @Test
    public void shouldReturnTotalTaxForItemWhichIsExemptedAndNotImported() {
        TotalSalesTax totalSalesTax = new TotalSalesTax("i am exempted and not from outside so i am totally tax free", 10.0);

        assertEquals(0.0, totalSalesTax.calculateTotalTax(), 0.0);
    }
}
