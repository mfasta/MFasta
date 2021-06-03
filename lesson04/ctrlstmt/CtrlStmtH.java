package lesson04.ctrlstmt;

// импорт сканнера из библиотеки
import java.util.Scanner;

// hasNextInt() проверяет является ли введеный тип int.
// hasNextFloat(), hasNextDouble() - можно проверить на float и double,
// соответственно.
public class CtrlStmtH {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Введено число " + number);
        }else {
            System.out.println("Неверный ввод. Нужно число." +
                    " Перезапустите программу и попробуйте снова!");
        }
    }
}
