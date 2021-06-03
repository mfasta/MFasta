package lesson10.constructorz.demoa;

public class EmployeeA {

    // поля-переменные
    String name;
    String position;
    int hours;
    float tariff;

    // конструктор
    public EmployeeA() {
        name = "Григорий";
        position = "директор";
        hours = 156;
        tariff = 12.55f;
    }

    float calculateSalary() {
        return hours * tariff;
    }

}
