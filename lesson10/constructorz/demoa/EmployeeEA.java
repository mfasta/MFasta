package lesson10.constructorz.demoa;

public class EmployeeEA {

    static String name;
    static String position;
    static int hours;
    static float tariff;
    static EmployeeE emp;

    public static void main(String[] args) {

        name = "Григорий";
        position = "директор";
        hours = 156;
        tariff = 12.55f;

        // создание экземпляра класса-конструктора
        emp = new EmployeeE();
        // установка значений
        emp.setName(name);
        emp.setPosition(position);
        emp.setHours(hours);
        emp.setTariff(tariff);

        System.out.println(
                emp.getName() +
                " " +
                emp.getPosition() +
                " зарплата: " +
                calculateSalary(emp.getHours(),emp.getTariff())
        );

    }

    private static float calculateSalary(int hour, float tariff ){
        return hour * tariff;
    }

}
