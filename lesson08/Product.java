package lesson08;

// Модель объекта продукта
public class Product {

    // Свойства объекта (переменные этого класса).
    // Модификатор private инкапсулирует (защищает)
    // доступ к свойствам.
    private String name;
    private int quantity;
    private double price;

    // Конструктор класса (объекта)
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // getters - получение/чтение значений переменных,
    // setters - чтение и запись переменных.
    // Модификатор public позволяет получить доступ к
    // переменным.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
