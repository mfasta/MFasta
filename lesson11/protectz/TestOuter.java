package lesson11.protectz;

import lesson11.protectz.innerpack.ProductA;

public class TestOuter {

    static String name;
    static int qnty;
    static double price;

    public static void main(String[] args) {
        name = "Orange";
        qnty = 14;
        price = 7.99;

        // ProductA в другом пакете
        ProductA productA = new ProductA(name,qnty,price);

        // ERROR !!!  package-private method
        //productA.infoSale();

        // NO ERROR public method
        productA.infoData();

        // ProductС в этом пакете
        ProductC productC = new ProductC(name,qnty,price);
        productC.infoData();
    }
}
