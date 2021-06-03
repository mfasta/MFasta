package lesson09.classez.democ;

// расчет дохода и налога с дохода
public class EmployeeA {

    static String name;
    static int hours;
    static double hourRate;
    static double taxRate;
    static Employee employee;
    static double income;
    static double tax;

    public static void main(String[] args) {

        name = "Денис";
        hours = 127;
        hourRate = 56.4;
        taxRate = 0.09;

// Создание экземпляра класса-конструктора
        employee = new Employee();

// Если оперируем только конструктором по умолчанию, то
// необходима установка значений через setters.
        employee.setName(name);
        employee.setHour(hours);
        employee.setTariff(hourRate);

        income = calculateIncome(employee.getHour(), employee.getTariff());
        tax = calculateTax(income, taxRate);

        System.out.printf("%s%nОтработано %d ч.%nДоход: %.2f грн.%nНалог: %.2f грн.",
                employee.getName(), employee.getHour(),income,tax);
    }

    //  Метод рассчета дохода
    private static double calculateIncome(int hours, double rate) {
        return hours * rate;
    }

    // Метод рассчета налога
    private static double calculateTax(double income, double taxRate ) {
        return income * taxRate;
    }
}
