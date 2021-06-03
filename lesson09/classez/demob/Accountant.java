package lesson09.classez.demob;

public class Accountant {

    public static void main(String[] args) {

        String duties = "Ведение бухгалтерского учета";

// создание объекта (экземпляра класса)
        Employee bookkeeper = new Employee();

// присваиваем значения переменным экземпляра
        bookkeeper.name = "Алина";
        bookkeeper.position = "бухгалтер";
        bookkeeper.wage = 450;
// запускаем метод показа данных
        bookkeeper.showInfo();

        System.out.println(duties);


    }
}
