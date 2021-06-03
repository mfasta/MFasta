package lesson01.example;


public class TaxCalc {

    public double countTax(double sales) {
        double tax;
        double taxRate;

        if (sales < 10000) {
            taxRate = 0.05;
            tax = sales * taxRate;
        }else if (sales > 10000 && sales <= 30000) {
            taxRate = 0.07;
            tax = sales * taxRate;
        }else {
            taxRate = 0.1;
            tax = sales * taxRate;
        }
        return tax;
    }
}
