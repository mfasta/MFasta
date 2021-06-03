package lesson02._02_types;

// Расширение или автоматическое
// преобразование (неявное) типов
public class TypeA {

    public static void main(String[] args) {

        int valueA = 128;

        // автоматическое преобразование типов
        long valueB = valueA;

        // автоматическое преобразование типов
        float valueC = valueB;

        System.out.println("Int value " + valueA);
        System.out.println("Long value " + valueB);
        System.out.println("Float value " + valueC);
    }
}
