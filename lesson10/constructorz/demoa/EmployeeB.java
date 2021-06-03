package lesson10.constructorz.demoa;

// Конструктор не указан явно.
// Есть по умолчанию.

public class EmployeeB {

    // поля-переменные
    int hours;
    float tariff;

    float calculateSalary(){
        return hours * tariff;
    }
}
