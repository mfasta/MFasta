package lesson02._01_variables;

public class VariablesE {

    public static void main(String [] args) {

        //доступ к статическим переменным
        Employee.salary = 1500.f;
        System.out.println(Employee.name + " зарплата: " + Employee.salary);
    }
}
