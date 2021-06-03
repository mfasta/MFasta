package lesson11.protectz;

import lesson11.protectz.innerpack.Product;

import java.text.DecimalFormat;

// наследник Product
// работа через конструктор
public class ProductC extends Product {
    double price;
    double totalSale;
    String saleResult;

    public ProductC(String name, int quantity, double price) {
        super(name, quantity);
        this.price = price;
    }

    // вывод результата
    // public method
    public void infoData(){
        totalSale = calculateTotalSale(getQnty(),price);
        saleResult = roundValue(totalSale);
        System.out.println(
                "\nТовар CA: " + getName() +
                "\nКоличество (кг): " + getQnty() +
                "\nСумма продажи (грн.): " + saleResult +
                "\n-----------------------------"
        );
    }

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
