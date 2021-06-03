package lesson10.constructorz.demoa;

public class EmployeeCA {

    public static void main(String[] args) {

        String name = "Григорий";
        String position = "директор";

        String name1 = "Марина";
        String position1 = "бухгалер";

        // создание экземпляра класса-конструктора
        EmployeeC emp = new EmployeeC(154, 14.75f);
        EmployeeC emp1 = new EmployeeC(158, 12.95f);

        System.out.println(
                name +
                " " +
                position +
                " зарплата: " +
                emp.calculateSalary());

        System.out.println(
                name1 +
                " " +
                position1 +
                " зарплата: " +
                emp1.calculateSalary());

    }
}
