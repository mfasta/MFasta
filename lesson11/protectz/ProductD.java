package lesson11.protectz;

import java.text.DecimalFormat;

// не наследник Product
// находится в другом пакете
public class ProductD {
    double price;
    double totalSale;
    String saleResult;

// ERROR !!! у Product protected конструктор и методы

//    Product product = new Product();
//
//    // вывод результата
//    // public method
//    public void infoData(){
//        totalSale = calculateTotalSale(product.getQnty(),price);
//        saleResult = roundValue(totalSale);
//        System.out.println(
//                "-----------------------------" +
//                        "\nТовар DA:" + product.getName() +
//                        "\nКоличество (кг): " + product.getQnty() +
//                        "\nСумма продажи (грн.): " + saleResult +
//                        "\n-----------------------------"
//        );
//    }

    // подсчет стоимости
    private static double calculateTotalSale(int quota, double price){
        return quota * price;
    }

    // округление значения
    private static String roundValue(double value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
