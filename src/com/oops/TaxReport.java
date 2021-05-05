package com.oops;
// this is a example of tightly coupled code
// we are using the class TaxCalculator so we are dependent on this class
// If our TaxCalculator class changes our report class might be affected
// ex : what if we have multiple parameter in our taxCalculator , we have to modify all the classes that are dependent on TaxCalculator class
public class TaxReport {
    private TaxCalculator calculator;
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
