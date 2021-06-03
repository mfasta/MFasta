package lesson06.finding;

// Поиск минимального значения в массиве
public class ArrayMin {

    public static void main(String[] args) {

        int[] nums = new int[] {24, 9, 93, 127, 13, 20};

        // Вызов метода расчета минимального значения
        int minNum = getMin(nums);
        System.out.println("Минимальное значение: " + minNum);
    }

    // находим минимум
    private static int getMin(int[] array){

        int minValue = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
