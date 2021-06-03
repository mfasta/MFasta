package lesson11.extendz.democ;


public class ProductB {

    // декларация переменных
    static String name;
    static int quota;
    static double price;
    static ProductA product;

    public static void main(String[] args) {

        // инициализация переменных
        name = "Апельсины";
        quota = 14;
        price = 8.99;

        // создание экземпляра класса
        product = new ProductA(name, quota, price);
        // вызов метода через экземпляр класса
        product.infoSale();
    }
}
