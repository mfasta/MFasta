package lesson10.constructorz.demoa;

public class EmployeeD {

    // поля-переменные
    String name;
    String position;
    int hours;
    float tariff;

    // параметризованный конструктор
    public EmployeeD(String name, String position, int hours, float tariff) {
        this.name = name;
        this.position = position;
        this.hours = hours;
        this.tariff = tariff;
    }
}
