package lesson07.overloadz;

public class OverloadC {


    public static void main(String[] args) {

        String name = "Григорий";
        String position = "директор";
        float salary = 230.5f;

        showInfo(name);
        showInfo(name, position);
        showInfo(name, position, salary);

        // Ошибка компиляции. Важен порядок полей!!!
//        showInfo(name, salary, position);

    }

// перегрузка методов

    public static void showInfo(String name) {
        System.out.println("Имя: " + name + "\n");
    }

    public static void showInfo(String name, String position) {
        System.out.println("Имя: " + name + "\nДолжность: "
                + position + "\n");
    }

    public static void showInfo(String name, String position, float salary) {
        System.out.println("Имя: " + name +
                "\nДолжность: " + position +
                "\nОклад: " + salary + " грн.");
    }

}
