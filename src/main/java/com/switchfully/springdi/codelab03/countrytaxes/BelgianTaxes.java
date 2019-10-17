package com.switchfully.springdi.codelab03.countrytaxes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BelgianTaxes implements TaxCalculation {
    public double calculateTaxesBasedOnYearlyIncome(int yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
