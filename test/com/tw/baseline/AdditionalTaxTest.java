package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionalTaxTest {

    @Test
    public void shouldReturnZeroIfAmountIsZero() {
        AdditionalTax additionalTax = new AdditionalTax("I am free", 0.0);

        assertEquals(0.0, additionalTax.calculateAdditionalTax(), 0.0d);
    }
}
