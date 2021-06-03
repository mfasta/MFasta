package lesson07.methodz;

public class FunctionA {

    public static void main(String[] args) {

        // объявление и инициализация переменных
        // локальные переменные метода main()
        String name = "Яблоки";
        String type = "красные";
        String measure = "(кг)";

        // вывод
        System.out.println("Hello from SUNNY-SHOP!");
        System.out.println("----------------------");
        System.out.println(name + " " + type + " " + measure + " " +
                calculateProductCost() + " грн.");
    }

    // метод расчета стоимости без параметров
    private static int calculateProductCost() {
        // локальные переменные метода
        int quantity = 6;
        int price = 5;
        // возврат результата метода
        return quantity * price;
    }
}
