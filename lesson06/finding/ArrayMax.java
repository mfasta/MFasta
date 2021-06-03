package lesson06.finding;

// Поиск максимального значения в массиве
public class ArrayMax {

    public static void main(String[] args) {

        int[] nums = new int[] {24, 9, 93, 127, 13, 20};

        // Вызов метода расчета максимального значения
        int maxNum = getMax(nums);
        System.out.println("Максимальное значение: " + maxNum);
    }

    // находим максимум
    private static int getMax(int[] array) {

        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
