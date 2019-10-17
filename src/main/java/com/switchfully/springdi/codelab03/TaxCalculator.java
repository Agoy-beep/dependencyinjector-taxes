package com.switchfully.springdi.codelab03;

import com.switchfully.springdi.codelab03.countrytaxes.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private final TaxCalculation taxCalculation;


    @Autowired
    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxes(int yearlyIncome){
        return taxCalculation.calculateTaxesBasedOnYearlyIncome(yearlyIncome);
    }
}
