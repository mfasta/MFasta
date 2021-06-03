package lesson02._03_operatorz;

// Операторы сравнения
public class OperatorzD {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 25;

        if (num1 == num2) {
            System.out.println("num1 и num2 равны");
        }else{
            System.out.println("num1 и num2 не равны");
        }

        if(num1 != num2){
            System.out.println("num1 и num2 не равны");
        }else{
            System.out.println("num1 и num2 равны");
        }

        if(num1 > num2){
            System.out.println("num1 больше num2");
        }else{
            System.out.println("num1 не больше num2");
        }

        if(num1 >= num2){
            System.out.println("num1 больше или равно num2");
        }else{
            System.out.println("num1 меньше num2");
        }

        if(num1 < num2){
            System.out.println("num1 меньше num2");
        }else{
            System.out.println("num1 не меньше num2");
        }

        if(num1 <= num2){
            System.out.println("num1 меньше или равно num2");
        }else{
            System.out.println("num1 больше num2");
        }
    }
}
