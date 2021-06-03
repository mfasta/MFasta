package lesson11.overridez.demoa;


public class Employee extends Person {

    private String company;

    public Employee(String name1, String company) {
// Обращение к суперклассу через super().
        super(name1);
        this.company = company;
    }

// Переопределение метода.
// Присутствует опциональная аннотация @Override.
    @Override
    public void display() {

// Вывод данных через обращение к методу суперкласса.
        System.out.printf("Имя: %s \n", getName());

// Вывод данных через super().
       //super.display();
        System.out.printf("Работает в %s \n", company);

    }
}
