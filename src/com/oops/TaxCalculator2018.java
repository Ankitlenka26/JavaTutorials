package com.oops;

public class TaxCalculator2018 implements TaxCalculator{ // this is indicating that it is implementing the interface so every method in the interface should be defined here
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    // Annotations are labels that we attach to our classes and methods
    // with this we give extra information to the java compiler
    @Override
    public double calculateTax(){
        return taxableIncome* 0.3;
    }
}
