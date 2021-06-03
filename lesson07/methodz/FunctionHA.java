package lesson07.methodz;

import java.text.DecimalFormat;

// рефакторинг кода, из класса FunctionH
public class FunctionHA {

    static long position;
    static String name;
    static String type;
    static double quantity;
    static double price;
    static double income;
    static String incomeRounded;
    static double tax;
    static String taxRounded;
    static double pureIncome;
    static String pureIncomeRounded;
    private final static double TAX_RATE = 7.5;

    public static void main(String[] args) {
        showTitle();
        showProductOne();
        showProductTwo();
    }

    private static void showTitle() {
        System.out.println("ОТЧЕТ" +
                "\n----------------------");
    }

    private static void showProductOne() {
        position = 1;
        name = "Яблоки";
        type = "красные";
        quantity = 6;
        price = 5.0;
        // обработка данных
        handleData();
        // вывод данных
        printInfo();
    }

    private static void showProductTwo() {
        position = 2;
        name = "Молоко";
        type = "\"Экстра\"";
        quantity = 7.051;
        price = 8.79;
        // обработка данных
        handleData();
        // вывод данных
        printInfo();
    }

    private static void handleData() {
        // обработка значений
        income = calcIncome(quantity, price);
        tax = calcTax(income);
        pureIncome = calcPureIncome(income,tax);
        // округление значений
        incomeRounded = roundValue(income);
        taxRounded = roundValue(tax);
        pureIncomeRounded = roundValue(pureIncome);
    }

    // метод вывода данных
    private static void printInfo() {
        System.out.println(position + ") " + name + " " + type
                + "\nДоход (грн.): " + incomeRounded
                + "\nНалог (грн.): " + taxRounded
                + "\nЧистый доход (грн.): " + pureIncomeRounded + "\n"
        );
    }

    private static double calcIncome(double quantity, double price) {
        return quantity * price;
    }

    private static double calcTax(double income) {
        return income * TAX_RATE / 100;
    }

    private static double calcPureIncome(double income, double tax) {
        return income - tax;
    }

    // округдение через DecimalFormat
    // #.00 - шаблон округления округляет до 2-х знаков
    // после десятичного разделителя.
    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }
}
