package com.switchfully.springdi.codelab03;

import com.switchfully.springdi.codelab03.countrytaxes.BelgianTaxes;
import com.switchfully.springdi.codelab03.countrytaxes.FrenchTaxes;
import com.switchfully.springdi.codelab03.countrytaxes.TaxCalculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test
    void calculateTaxesFrench() {
        //GIVEN
        TaxCalculator calculator = new TaxCalculator(new FrenchTaxes());
        //WHEN
        //THEN
        assertEquals(5000 * 0.48, calculator.calculateTaxes(5000));
    }
    @Test
    void calculateTaxesBelgian() {
        //GIVEN
        TaxCalculator calculator = new TaxCalculator(new BelgianTaxes());
        //WHEN
        //THEN
        assertEquals(5000 * 0.45, calculator.calculateTaxes(5000));
    }
}