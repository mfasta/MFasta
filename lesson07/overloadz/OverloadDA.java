package lesson07.overloadz;

// наследование
public class OverloadDA extends OverloadD{

    public static void main(String[] args) {
        String name = "Григорий";
        String position = "директор";
        float salary = 230.5f;

// вызов методов из класса OverloadD
        showInfo(name);
        showInfo(name, position);
        showInfo(name, position, salary);

    }
}
