package lesson04.ctrlstmt;

// Оператор switch.
// Конструкция switch-case позволяет обработать
// сразу несколько условий.
// После ключевого слова switch в () идет сравниваемое
// выражение.
// Значение этого выражения последовательно сравнивается
// со значениями, помещенными после оператора сase.
// И если совпадение будет найдено, то будет выполняться
// определенный блок сase.

public class CtrlStmtD {

    public static void main(String[] args) {

        int num = 1;
        switch(num) {
            case 1: System.out.println("num равно 1");
                break; // <- break !!!
            case 2: System.out.println("num равно 2");
                break;
            default: // <- вывод значения вне условий
                System.out.println("num не равно 1, 2");
        }

        // улучшенное написание switch
        switch (num) {
            case 1 -> System.out.println("num равно 1");
            case 2 -> System.out.println("num равно 2");
            default -> System.out.println("num не равно 1, 2");
        }

        // Составные case
        int dayInt = 6;
        switch (dayInt) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Рабочий день");
                break;
            case 6: case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Неизвестно");
        }

        // улучшенное написание switch
        switch (dayInt) {
            case 1, 2, 3, 4, 5 -> System.out.println("Рабочий день");
            case 6, 7 -> System.out.println("Выходной день");
            default -> System.out.println("Неизвестно");
        }


        String dayString = "Tue";
        // метод trim() обрезает крайние пробелы строкового ввода
        switch (dayString.trim()) {
            case "Mon": case "Tue": case "Wed": case "Thu": case "Fri":
                System.out.println("Рабочий день"); break;
            case "Sat": case "Sun":
                System.out.println("Выходной день"); break;
            default:
                System.out.println("Неизвестно");
        }
    }
}
