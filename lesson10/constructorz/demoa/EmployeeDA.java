package lesson10.constructorz.demoa;

public class EmployeeDA {

    static String name;
    static String position;
    static int hours;
    static float tariff;
    static EmployeeD emp;

    public static void main(String[] args) {

        name = "Григорий";
        position = "директор";
        hours = 156;
        tariff = 12.55f;

        // создание экземпляра класса-конструктора
        emp = new EmployeeD(name, position, hours, tariff);

        System.out.println(
                emp.name +
                " " +
                emp.position +
                " зарплата: " +
                calculateSalary(emp.hours, emp.tariff));
    }

    private static float calculateSalary(int h, float t){
        return h * t;
    }
}
