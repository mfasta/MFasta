package lesson02._02_types;

// Продвижение типа в выражениях
public class TypeC {

    public static void main(String[] args) {

        byte b = 23;
        char c = 'g';
        short s = 1019;
        int i = 30000;
        float f = 6.57f;
        double d = .1299;

        // выражение
        double result = (f * b) + (i / c) - (d * s);

        // Результат после проведения всех действий
        System.out.println("result = " + result);
    }
}
