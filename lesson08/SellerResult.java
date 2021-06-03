package lesson08;

// Класс-входная точка в программу
public class SellerResult {

    // Объявление переменных этого класса
    private static String name;
    private static String email;
    private static String phone;
    private static String productName;
    private static int quantity;
    private static double price;
    private static String roundBonus;

    // Метод main() - входная точка в программу.
    public static void main(String[] args) {
        // Последовательный вызов методов этого класса
        // для выполнения программы.
        initVars();
        showTitle();
        processData();
        showBonus();
    }

    // Инициализация переменных этого класса
    // в отдельном методе этого класса.
    private static void initVars() {
        name = "Григорий";
        email = "georg@mail.net";
        phone = "055 123-4567";
        productName = "апельсины";
        quantity = 267;
        price = 17.99;
    }

    private static void showTitle(){
        System.out.println(
                "ПРОДАЖИ"
                + "\n-----------------------------"
        );
    }

    private static void showBonus() {
        System.out.println(
                "Бонус (грн.): " + roundBonus
                + "\n-----------------------------"
        );
    }

    private static void processData() {

        // Создание экземпляра класса.
        SellerInfo seller = new SellerInfo(name, email, phone);
        // Вызов метода через экземпляра класса.
        seller.infoSeller();

        // Создание экземпляра класса.
        ProductData product = new ProductData(productName, quantity, price);
        // Вызов метода через экземпляра класса.
        product.infoProduct();

        // Создание экземпляра класса.
        BonusCalc bonusCalc = new BonusCalc();
        // Объявление локальной переменной и ее инициализация путем
        // вызова метода через экземпляра класса.
        double bonusResult = bonusCalc.calcBonus(quantity, price);

        // Инициализация переменной класса путем вызова статического
        // метода не через экземпляра класса.
        roundBonus = Rounder.roundValue(bonusResult);
    }
}
