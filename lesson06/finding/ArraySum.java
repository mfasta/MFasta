package lesson06.finding;

// Вычисление суммы элементов массива
public class ArraySum {

    public static void main(String[] args) {

        int[] nums = new int[] {24, 9, 93, 127, 13, 20};

        // Вызов методов расчета
        int sumNumA = getSumA(nums);
        int sumNumB = getSumB(nums);

        System.out.println("Сумма равна " + sumNumA);
        System.out.println("Сумма равна " + sumNumB);
    }

    // перебираем массив и добавляем каждый элемент к суммирующей переменной
    private static int getSumA(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // вычисляем сумму через индексы
    private static int getSumB(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i)
            sum += array[i];
        return sum;
    }
}
