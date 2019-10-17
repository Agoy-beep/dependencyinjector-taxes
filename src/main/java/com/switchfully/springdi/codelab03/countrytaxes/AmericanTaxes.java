package com.switchfully.springdi.codelab03.countrytaxes;

import org.springframework.stereotype.Component;

@Component("american")
public class AmericanTaxes implements TaxCalculation {

    public double calculateTaxesBasedOnYearlyIncome(int yearlyIncome) {
        return yearlyIncome * 0.18 + 950;
    }
}
