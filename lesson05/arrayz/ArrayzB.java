package lesson05.arrayz;

// Многомерные массивы

import java.util.Arrays;

public class ArrayzB {

    public static void main(String[] args) {

        int[][] nums = { { 4, 13, 23 }, { 3, 14, 52 } };
// Вывод значений масссива.
// Метод Arrays.deepToString()  языка Java возвращает строковое
// представление многомерного массива, выделяя строки квадратными
// скобками.
        System.out.println("Пример № 1:");
        System.out.println(Arrays.deepToString(nums));
// Вывод значения строки 2 столбца 1
        System.out.println(nums[1][0]);


        String[][] strs = { { "Яблоко", "Груша", "Слива" },
                { "Апельсин", "Лимон", "Грейпфрут" } };
        System.out.println("\nПример № 2:");
// Вывод значения строки 2 столбца 3
        System.out.println(strs[1][2]);


// Количество строк и столбцов в квадратных скобках.
        int[][] nums1 = new int[3][3];
// Установление значений массива
        nums1[0][0] = 5;
        nums1[0][1] = 12;
        nums1[0][2] = 5;
        nums1[1][0] = 17;
        nums1[1][1] = 2;
        nums1[1][2] = 9;
        nums1[2][0] = 24;
        nums1[2][1] = 8;
        nums1[2][2] = 3;
// Вывод значений масссива
        System.out.println("\nПример № 3:");
        System.out.println(Arrays.deepToString(nums1));
// Вывод значения строки 2 столбца 1
        System.out.println(nums1[1][0]);

    }
}
