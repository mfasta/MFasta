package lesson01.example;

public class Test {

    private static String productName;
    private static int quantity;
    private static double price;
    private static String roundSale;
    private static String roundTax;

    public static void main(String[] args) {
        initVars();
        roundSale = Rounder.roundValue(getSale());
        roundTax = Rounder.roundValue(getTax());
        showData();
    }

    private static void initVars() {
        productName = "апельсины";
        quantity = 267;
        price = 27.99;
    }

    private static double getSale() {
        SaleCalc sale = new SaleCalc();
        return sale.calculateSales(quantity, price);
    }

    private static double getTax() {
        TaxCalc tax = new TaxCalc();
        return tax.countTax(getSale());
    }

    private static void showData() {
        System.out.println(
                "ПРОДАЖИ"
                + "\n-----------------------------"
                + "\nТовар: " + productName
                + "\nОбъем продаж (грн.): " + roundSale
                + "\nНалог (грн.): " + roundTax
                + "\n-----------------------------"
        );
    }
}
