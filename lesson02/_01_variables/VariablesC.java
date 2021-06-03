package lesson02._01_variables;

public class VariablesC {

    public static void main(String[] args) {

        System.out.println("Сумма равна:");
        System.out.println(calculateSum());
    }

    // метод
    private static int calculateSum() {
    // локальная переменная
        int a = 21;
        int b = 5;
        return a + b;
    }
}
