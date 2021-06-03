package lesson05.arrayz;

import java.util.Arrays;

public class ArrayzA {

// объявление массива вне метода main
    static String[] fruits;

    public static void main(String[] args) {
/*
При такой инициализации все элементы массива имеют значение по умолчанию.
Для числовых типов (в том числе для типа char) это число 0,
для типа boolean это значение false, а для остальных объектов это значение null.
Например, для типа int значением по умолчанию является число 0,
поэтому определенный массив nums будет состоять из 5 нулей.

Метод Arrays.toString() возвращает строковое представление одномерного массива,
разделяя элементы запятой.
* */
        int[] nums = new int[5];
        String[] elements = new String[3];
        System.out.println("Пример № 1:");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(elements));

// Равноценные способы задания значений массива.
// В квадратных скобках не указывается размер массива, так как он вычисляется
// по количеству элементов в фигурных скобках.
// Нумерация мест расположения (индексов) элементов массива начинается с нуля,
// т.е. в массиве nums1 пять эелементов расположены в индексах 0, 1, 2, 3, 4.

        int[] nums1 = new int[] { 1, 9, 3, 5, 8 };
        System.out.println("\nПример № 2:\n" + Arrays.toString(nums1));
        // length возвращает длину массива, то есть количество его элементов
        int arrLength = nums1.length;
        System.out.println("Длина массива: " + arrLength);

        int[] nums2 = { 1, 9, 3, 5, 8 };
        System.out.println("\nПример № 3:\n" + Arrays.toString(nums2));
        // Иногда неизвестен последний индекс, чтобы получить
        // последний элемент массива
        int lastVal = nums2[nums2.length - 1];
        System.out.println(lastVal);


// строковый массив
        String [] strs = {"Яблоко", "Апельсин", "Груша", "Слива"};
        System.out.println("\nПример № 4:\n" + Arrays.toString(strs));


// можем обратиться к любому элементу массива по индексу, который передается
// в квадратных скобках после названия переменной массива
        int[] nums3 = new int[5];
// устанавливаем значения элементов массива
        nums3[0] = 5;
        nums3[1] = 22;
        nums3[2] = 13;
        nums3[3] = 104;
        nums3[4] = 16;
        System.out.println("\nПример № 5:\n" + Arrays.toString(nums3));
// Индексация элементов массива начинается с 0,
// получаем значение третьего элемента массива
        System.out.println(nums3[2]);
// обращение вне массива, будет ошибка
//        System.out.println(nums3[5]);


// создаем массив определенной длины,
// и заполняем его поиндексно
        String [] strs1 = new String[5];
        strs1[0] = "Яблоко";
        strs1[1] = "Апельсин";
        strs1[2] = "Лимон";
        strs1[3] = "Груша";
        strs1[4] = "Слива";
        int position = 3;
        System.out.println("\nПример № 6:\nЭлемент "
                + position + " - " + strs1[position]);
        int arrLength1 = strs1.length;
        System.out.println("Длина массива: " + arrLength1);


// инициализация и вывод массива, объявленного вне метода main
        fruits = new String[]{"Апельсин", "Манго", "Киви", "Яблоко"};
        System.out.println("\nПример № 7:\n" + Arrays.toString(fruits));
        // последний элемент массива
        String lastValue = fruits[fruits.length - 1];
        System.out.println(lastValue);

    }
}
