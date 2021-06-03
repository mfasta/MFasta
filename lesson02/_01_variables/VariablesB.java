package lesson02._01_variables;

// в процессе работы программы можно
// менять значение переменной
public class VariablesB {

    // объявление/декларация переменных
    // вне метода main()
    static String product;
    static double price;

    // набор модификаторов private static final
    // определяет константы
    private static final String NAME = "Григорий";
    private static final double WAGE_MONTH = 12789.75;

    public static void main(String[] args) {

        int x = 14;
        System.out.println(x);

        x = 28;
        System.out.println(x);

        String y = "Первое значение";
        System.out.println(y);

        y = "Второе значение";
        System.out.println(y);

        // начальная инициализация переменных, объявленных
        // вне метода main()
        product = "Апельсин";
        price = 5.25;
        System.out.println(product + " за " + price + " грн.");

        System.out.println(NAME + " зарабатывает " + WAGE_MONTH + " грн.");

        // изменение значений переменных, объявленных
        // вне метода main()
        product = "Батон";
        price = 1.99;
        System.out.println(product + " за " + price + " грн.");

    }
}
