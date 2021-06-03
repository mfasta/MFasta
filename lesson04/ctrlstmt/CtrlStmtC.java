package lesson04.ctrlstmt;

// Разновидность for-each цикла for.
// При выполнении операций с массивами возникают ситуации,
// когда должен быть обработан каждый элемент массива.
// В цикле  for-each происходит последовательное обращение
// к каждому элементу совокупности объектов (например, массива).
// Например, для расчета суммы всех значений, содержащихся
// в массиве, нужно обратиться ко всем его элементам.
// Разновидность for-each цикла for называется также расширенным
// циклом for.

public class CtrlStmtC {

    public static void main(String[] args) {

// Пример № 1 (проход по int массиву).
// Суммирование и отображение значений.
        int[] numsA = {2, 15, 3, 4, 5, 6, 17, 8, 9, 10};
        System.out.println("\n\nПример № 1:");
        int sum = 0;

        // Традиционный цикл for для вычисления суммы
        // значений элементов массива
        // for (int i=0; i < 10; i++) sum += numsA[i];

        // Через for-each
        for (int x : numsA) {
            System.out.println("Значение: " + x);
            // += - составная операция присваивания,
            // аналогично sum = sum + x;
            sum += x;
        }
        System.out.println("Сумма общая: " + sum);


// Пример № 2 (проход по String массиву)
// вывод через ","
        String[] strsA = {"apple", "orange", "carrot",
                "potato", "ice cream"};
        System.out.println("\n\nПример № 2:");
        int lenA = strsA.length;
        int countA = 0;
        for(String i : strsA) {
            if (countA < lenA-1) System.out.print(i + ", ");
            else System.out.print(i);
            countA++;
        }


// Пример № 3 (проход по String массиву c continue)
// вывод через ","
        String[] elsB = {"apple", "orange", "carrot", "potato",
                "ice cream"};
        System.out.println("\n\nПример № 3:");
        int lenB = elsB.length;
        int countB = 0;
        for(String i : elsB) {
            if (i.equals("potato"))
                continue;
            else if (countB < lenB-2)
                System.out.print(i + ", ");
            else
                System.out.print(i);
            countB++;
        }
    }
}
