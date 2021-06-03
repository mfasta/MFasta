package lesson04.ctrlstmt;

// Цикл for.
// Формальное определение цикла for:
//   for ([инициализация счетчика]; [условие]; [изменение счетчика]){
//     ... действия ...
//  }

public class CtrlStmtB {

    public static void main(String[] args) {

// Пример № 1 (все значения и условия в for())
        System.out.println("\nПример № 1:");
        // Базовый цикл for.
        // ++ - инкремент (увеличение на единицу).
        for (int a = 1; a < 5; a++){
            System.out.println("Наше значение: " + a);
        }


// Пример № 2 (в for() только условие)
// Эквивалент базового цикла for.
// Есть счетчик, только создан он вне цикла.
// Есть условие выполнения цикла.
// И есть приращение счетчика уже в самом блоке for.
        int b = 1; // <- счетчик
        System.out.println("\nПример № 2:");
        for (; b < 5;) { // <- в () только условие
            System.out.println("Наше значение: " + b);
            b++; // <- приращение счетчика
        }


/* Пример № 3 (в for() множественные значения и условия).
Работа с несколькими переменными в цикле for.
Инкремент и декремент одновременно.
1-й проход: c == 1, d == 7, true, e == 2, d == 6, output == 7.
2-й проход: c == 1, d == 6, true, e == 3, d == 5, output == 6.
3-й проход: c == 1, d == 5, true, e == 4, d == 4, output == 5.
4-й проход: c == 1, d == 4, false, прекращение цикла.
**/
        int n = 8;
        int e = 1;
        System.out.println("\nПример № 3:");
        for(int c = 1, d = n - 1; e < d; e++, d--) {
            System.out.print((c * d) + " ");
        }


// Пример № 4 (проход по массиву)
// Прекращение выполнения после истинности условия.
// Оператор break позволяет выйти из цикла в любой
// его момент, даже если цикл не закончил свою работу.
        int[] numsA = new int[] { 1, 2, 6, 4, 5, 9, 7, 3 };
        int lenA = numsA.length;
        System.out.println("\n\nПример № 4:");
        System.out.println("Длина массива равна " + lenA);
        for (int f = 0; f < lenA; f++) {
            if (numsA[f] > 8)
                break; // <- Оператор break
            System.out.print(numsA[f] + " ");
        }


// Пример № 5 (проход по массиву)
// Продолжение выполнения после истинности условия.
// Оператор continue позволяет продолжить цикл после
// определенного значения.
        int[] numsB = new int[] { 1, 2, 6, 4, 5, 9, 7, 3 };
        System.out.println("\n\nПример № 5:");
        for (int g = 0; g < numsB.length; g++) {
            if (numsB[g] > 8)
                continue; // <- Оператор continue
            System.out.print(numsB[g] + " ");
        }

// variant for-each
//        for (int i : numsB) {
//            if (i > 8)
//                continue;
//            System.out.print(i + " ");
//        }

    }
}
