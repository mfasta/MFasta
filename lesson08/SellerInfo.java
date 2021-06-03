package lesson08;

// Класс обработки данных продавца
// пример наследования
public class SellerInfo extends Seller {

    public SellerInfo(String name, String email, String phone) {
        // доступ к переменным родительского
        // класса через super
        super(name, email, phone);
    }

    // метод вывода значений
    public void infoSeller() {
        System.out.println(
                "Продавец: " + getName() +
                "\nE-mail: " + getEmail() +
                "\nТелефон: " + getPhone()
        );
    }
}
