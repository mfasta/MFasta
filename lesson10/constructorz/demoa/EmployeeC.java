package lesson10.constructorz.demoa;

// Параметризированный конструктор

public class EmployeeC {

    // поля-переменные
    int hours;
    float tariff;

    //// конструктор с параметрами
    EmployeeC(int hr, float t){
        hours = hr;
        tariff = t;
    }

    float calculateSalary(){
        return hours * tariff;
    }

}
