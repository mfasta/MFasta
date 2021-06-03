package lesson06.finding;

// Поиск среднего арифметического значения.
// Среднее арифметическое = сумма чисел / количество чисел.
ArrayAverage {

    public static void main(String[] args) {
        int[] nums = {5, 8, 12, -8, -4, 37, 15};

        // Вызов метода расчета среднего арифметического значения
        double avgNum = getAverage(nums);
        System.out.printf("Среднее значение: %.3f", avgNum);
    }

    // находим среднее арифметическое значение
    private static double getAverage(int[] array) {

        double average = 0;
        
        if (array.length > 0) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = (double) sum / array.length;
        }
        return  average;
    }
}
