package lesson09.classez.demob;

public class Employee {

    String name;
    String position;
    int wage;

    void showInfo() {
        System.out.printf("Имя: %s, должность: %s, оклад: %d\n",
                name, position, wage);
    }
}
