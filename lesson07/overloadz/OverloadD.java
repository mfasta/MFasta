package lesson07.overloadz;

// суперкласс для класса OverloadDA

public class OverloadD {

// перегрузка методов

    public static void showInfo(String name) {
        System.out.println("Имя: " + name + "\n");
    }

    public static void showInfo(String name, String position) {
        System.out.println("Имя: " +
                name + "\nДолжность: " +
                position + "\n");
    }

    public static void showInfo(String name, String position, float salary) {
        System.out.println("Имя: " + name +
                "\nДолжность: " + position +
                "\nОклад: " + salary + " грн.");
    }
}
