package com.oops;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100000);
        var report = new TaxReport(calculator);
        report.show();
        // Throughout the lifetime of this program we can change the dependency
        report.setCalculator(new TaxCalculator2019());
        report.show();
    }
}
