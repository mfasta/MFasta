package lesson07.methodz;

// применение метода с параметрами
// Параметр - это переменная в определении метода. Когда вызывается метод,
// аргументы - это данные, которые вы передаете в параметры метода.
// Параметр является переменной в объявлении функции. Аргумент - это
// фактическое значение этой переменной, которое передается функции.
public class FunctionB {

    public static void main(String[] args) {

        // объявление и инициализация переменных
        // локальные переменные метода main()
        String name = "Яблоки";
        String type = "красные";
        String measure = "кг";
        int quantity = 6;
        int price = 5;
        double koef = 1.5; // типа коэффициент свежести :)

        // вывод
        System.out.println("Hello from SUNNY-SHOP!");
        System.out.println("------------------------");
        System.out.println(name + " " + type + " " + quantity + " " + measure +
                " " + price + " грн./" + measure + " " +
                // метод с аргументами
                calculateProductCost(quantity, price, koef) + " грн.");
    }

    // метод расчета стоимости с параметрами
    private static double calculateProductCost(int quantity, int price, double koef) {
        return quantity * price * koef;
    }
}
