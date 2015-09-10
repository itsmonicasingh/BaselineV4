package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TotalSalesTaxTest {

    @Test
    public void shouldReturnTotalTaxAsZeroIfNoItemIsPurchased() {
        TotalSalesTax totalSalesTax = new TotalSalesTax(1, "item 1", 0.0);

        assertEquals(0.0, totalSalesTax.calculateTotalTax(), 0.0d);
    }

    @Test
    public void shouldReturnTotalTaxForItemWhichIsExemptedAndNotImported() {
        TotalSalesTax totalSalesTax = new TotalSalesTax(1, "i am exempted and not from outside so i am totally tax free", 10.0);

        assertEquals(1.0, totalSalesTax.calculateTotalTax(), 0.0);
    }

    @Test
    public void shouldCalculateTotalTaxForItemWhichIsNonImportedAndNonExempted() {
        TotalSalesTax totalSalesTax = new TotalSalesTax(1, "any item", 100.0);

        assertEquals(10.0, totalSalesTax.calculateTotalTax(), 0.0000);
    }

    @Test
    public void shouldCalculateTotalTaxForItemWhichIsNotExemptedButImported() {
        TotalSalesTax totalSalesTax = new TotalSalesTax(1, "any imported good", 100.0);

        assertEquals(60.0, totalSalesTax.calculateTotalTax(), 0.0000);
    }

    @Test
    public void shouldCalculateTotalTaxOnGivenCommodityWhichIsExemptedButImported() {
        TotalSalesTax totalSalesTax = new TotalSalesTax(1, "imported box of chocolates", 10.0);

        assertEquals(6.0, totalSalesTax.calculateTotalTax(), 0.0000);
    }

    @Test
    public void shouldReturnTotalPriceIncludingTaxAsZeroIfPriceIsZero() {
        TotalSalesTax totalSalesTax = new TotalSalesTax(1, "any good", 0.0);

        assertEquals(0.0, totalSalesTax.totalPriceIncludingTax(), 0.000);
    }

}
