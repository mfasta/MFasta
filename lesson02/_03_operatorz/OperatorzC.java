package lesson02._03_operatorz;

// Операторы авто-инкремента и авто-декремента
public class OperatorzC {

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        // постфиксная форма, операция следует за операндом
        num1++; // num1 = num1 + 1
        num2--; // num1 = num2 - 1
        System.out.println("1) num1 = " + num1);
        System.out.println("2) num2 = " + num2);

        // префиксная форма, операция предшествует операнду
        ++num1; // num1 = num1 + 1
        --num2; // num1 = num2 - 1
        System.out.println("3) num1 = " + num1);
        System.out.println("4) num2 = " + num2);


        int num3 = 15;
        // сначала значение из переменной а будет записано в
        // переменную num4 и только потом инкремент (постфиксная форма)
        int num4 = num3++;
        // сначала выполнится инкремент (префиксная форма),
        // потом новое значение из num3 будет записано в переменную с
        int num5 = ++num3;
        num5++;
        System.out.println("5) num3 = " + num3);
        System.out.println("6) num4 = " + num4);
        System.out.println("7) num5 = " + num5);
    }
}
