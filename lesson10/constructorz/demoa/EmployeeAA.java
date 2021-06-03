package lesson10.constructorz.demoa;

public class EmployeeAA {

    public static void main(String[] args) {

        // создание экземпляра класса-конструктора
        EmployeeA emp = new EmployeeA();

        System.out.println(
                emp.name +
                " " +
                emp.position +
                " зарплата: " +
                emp.calculateSalary()
        );
    }
}
