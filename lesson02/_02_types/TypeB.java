package lesson02._02_types;

// Сужающее или явное преобразование типов.
// Приведение типов - явное преобразование типов.
public class TypeB {

    public static void main(String[] args) {

        double valueA = 129.57;

        // явное преобразование типов
        long valueB = (long) valueA;

        // явное преобразование типов
        int valueC = (int) valueB;
        System.out.println("Double value " + valueA);

        // потеря дробной части
        System.out.println("Long value " + valueB);

        // потеря дробной части
        System.out.println("Int value " + valueC);

        // ERROR: несовместимые типы
//        char valueD = 'd';
//        int num = 87;
//        valueD = num;

    }
}
