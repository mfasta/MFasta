package lesson05.arrayz;

import java.util.Arrays;

//  Сортировка массива.
//  Метод Arrays.sort() позволяет сортировать элементы
//  массива по возрастанию.
public class ArrayzC {

    public static void main(String[] args) {

        //  Сортировка массива полностью.
        int[] arrayA = new int[]{4, 2, 12, 9, 5, 17};
        System.out.println("\nПример № 1\n---------------");
        System.out.println("Не сортирован " + Arrays.toString(arrayA));
        Arrays.sort(arrayA);
        System.out.println("Сортирован " + Arrays.toString(arrayA));

        // Сортировка части массива.
        int[] arrayB = {4, 2, 12, 9, 5, 17};
        System.out.println("\nПример № 2\n---------------");
        System.out.println("Не сортирован " + Arrays.toString(arrayB));
        // сортировка от индекса, включительно, до индекса, исключительно
        Arrays.sort(arrayB, 1, 4);
        System.out.println("Сортирован " + Arrays.toString(arrayB));
    }
}
