package lesson09.classez.demob;

public class Chief {

    public static void main(String[] args) {

// создание объекта (экземпляра класса)
        Employee director = new Employee();

// присваиваем значения переменным экземпляра
        director.name = "Григорий";
        director.position = "директор";
        director.wage = 500;
// запускаем метод показа данных
        director.showInfo();
    }

}
