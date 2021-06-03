package lesson10.constructorz.demoa;

public class EmployeeBA {

    public static void main(String[] args) {

        String name = "Григорий";
        String position = "директор";

        // создание экземпляра класса-конструктора
        EmployeeB emp = new EmployeeB();

        emp.hours = 157;
        emp.tariff = 13.25f;

        System.out.println(
                name +
                " " +
                position +
                " зарплата: " +
                emp.calculateSalary());

    }
}
