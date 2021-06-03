package lesson02._03_operatorz;

// Операторы присваивания
public class OperatorzB {

    public static void main(String[] args) {
        int num1 = 10;
        int num2;

        // num2 = num1 назначит значение переменной num1 переменной num2.
        num2 = num1;
        System.out.println("= вывод: " + num2);

        // num2 += num1 эквивалентно num2 = num2 + num1
        // + =  <- ошибка!
        // надо без пробела между + и =
        num2 += num1;
        System.out.println("+= вывод: " + num2);

        // num2 -= num1 эквивалентно num2 = num2-num1
        num2 -= num1;
        System.out.println("-= вывод: " + num2);

        // num2 *= num1 эквивалентно num2 = num2 * num1
        num2 *= num1;
        System.out.println("*= вывод: " + num2);

        // num2 /= num1 эквивалентно num2 = num2 / num1
        num2 /= num1;
        System.out.println("/= вывод: " + num2);

        // num2 %= num1 эквивалентно num2 = num2% num1
        num2 %= num1;
        System.out.println("%= вывод: " + num2);
    }
}
