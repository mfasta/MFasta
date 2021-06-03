package lesson11.extendz.democ;

import java.util.Scanner;

// реализация через Scanner
//
// BUG !!! Значение цены необходимо вводить
// через ",", а не через "."
public class ProductC {

    static Scanner scanner;
    static String name;
    static int quota;
    static double price;
    static ProductA product;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Введите название: ");
        name = scanner.nextLine();
        System.out.println("Введите количество: ");
        quota = scanner.nextInt();
        System.out.println("Введите цену: ");
        price = scanner.nextDouble();

        product = new ProductA(name, quota, price);
        product.infoSale();
    }
}
