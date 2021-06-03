package lesson04.ctrlstmt;

// Цикл while, do-while.
// Цикл while сразу проверяет истинность некоторого условия,
// и если условие истинно, то код цикла выполняется.
// Оператор do сначала выполняет код цикла, а потом проверяет условие
// в инструкции while. И пока это условие истинно, цикл повторяется.
// Цикл do гарантирует хотя бы однократное выполнение действий, даже
// если условие в инструкции while не будет истинно.

public class CtrlStmtE {

    public static void main(String[] args) {

// Пример № 1
        int a = 7;
        System.out.println("\nПример № 1:");
        while (a > 0) {
            System.out.print(a + " ");
            a--;
        }


/* Пример № 2
Разница между do-while и while заключается в том, что do-while
оценивает выражение в нижней части цикла, а не в его верхней части.
Поэтому операторы внутри блока do всегда выполняются хотя бы один раз.
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
**/
        int b = 6;
        System.out.println("\n\nПример № 2:");
        do {
            System.out.print(b + " ");
            b--;
        }
        while (b > 0);


// Пример № 3
// Вывод всего лишь один раз (несоответсвие условию).
        int c = -1;
        System.out.println("\n\nПример № 3:");
        do{
            System.out.println(c + " ");
            c++;
        }
        while (c > 0);

    }
}
