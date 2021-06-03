package lesson07.methodz;

// сокращение кода, из класса FunctionE
public class FunctionEA {

    static long position;
    static String name;
    static String type;
    static String measure;
    static double quantity;
    static double price;
    static double cost;

    public static void main(String[] args) {
        showTitle();
        showProductOne();
        showProductTwo();
    }

    private static void showTitle() {
        System.out.println("ПЕРЕЧЕНЬ ТОВАРОВ" +
                "\n----------------------");
    }

    private static void showProductOne() {
        position = 1;
        name = "Яблоки";
        type = "красные";
        measure = "кг";
        quantity = 6;
        price = 5.99;
        cost = calculateProductCost(quantity, price);
        printInfo();
    }

    private static void showProductTwo() {
        position = 2;
        name = "Молоко";
        type = "\"Экстра\"";
        measure = "л";
        quantity = 7.051;
        price = 8.79;
        cost = calculateProductCost(quantity, price);
        printInfo();
    }

    // метод вывода данных
    private static void printInfo() {
        System.out.printf("%d. %s %s%nКоличество: %.3f %s%nЦена: %.2f грн./%s%n" +
                        "Стоимость: %.2f грн.%n%n",
                position, name, type, quantity, measure, price, measure, cost);
    }

    private static double calculateProductCost(double quantity, double price) {
        return quantity * price;
    }
}
