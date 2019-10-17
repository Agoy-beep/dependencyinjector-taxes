package com.switchfully.springdi.codelab03.countrytaxes;

import org.springframework.stereotype.Component;

;@Component
public class FrenchTaxes implements TaxCalculation {
    public double calculateTaxesBasedOnYearlyIncome(int yearlyIncome) {
        return yearlyIncome * 0.48;
    }
}
