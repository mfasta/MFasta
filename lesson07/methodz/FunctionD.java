package lesson07.methodz;

// обработка отдельных данных в
// отдельных методах
public class FunctionD {

    // объявление переменных
    static String position;     // позиция в перечне
    static String name;         // наименование товара
    static String type;         // тип товара
    static String measure;      // единица измерения
    static int quantity;        // количество
    static int price;           // цена
    static float cost;          // стоимость

    public static void main(String[] args) {
        // вызов методов
        showTitle();
        showProductOne();
        showProductTwo();
    }

    // метод вывода заголовка
    private static void showTitle() {
        System.out.println("ПЕРЕЧЕНЬ ТОВАРОВ" +
                "\n----------------------");
    }

    // метод обработки и вывода данных по товару 1
    private static void showProductOne() {
        position = "1.";
        name = "Яблоки";
        type = "красные";
        measure = "кг";
        quantity = 6;
        price = 5;
        cost = calculateProductCost(quantity, price);

        System.out.println(position + " " + name + " " + type + " "
                + quantity + " " + measure + " " + price + " грн./"
                + measure + " " + cost + " грн.");
    }

    // метод обработки и вывода данных по товару 2
    private static void showProductTwo() {
        position = "2.";
        name = "Молоко";
        type = "белое";
        measure = "л";
        quantity = 7;
        price = 8;
        cost = calculateProductCost(quantity, price);

        System.out.println(position + " " + name + " " + type + " "
                + quantity + " " + measure + " " + price + " грн./"
                + measure + " " + cost + " грн.");
    }

    // метод расчета стоимости
    private static float calculateProductCost(int quantity, int price) {
        return quantity * price;
    }
}
