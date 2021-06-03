package lesson11.overridez.demoa;

public class DemoA {

    public static void main(String[] args) {

        String mName = "Соня";
        String mCompany = "Oracle";

        Employee employee = new Employee(mName, mCompany);
        employee.display();

    }

}
