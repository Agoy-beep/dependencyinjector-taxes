package com.switchfully.springdi.codelab03;

import com.switchfully.springdi.codelab03.config.Config;
import com.switchfully.springdi.codelab03.countrytaxes.TaxCalculation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        TaxCalculation american = context.getBean("american", TaxCalculation.class);

        System.out.println(american.calculateTaxesBasedOnYearlyIncome(23000));
    }
}
