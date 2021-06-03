package lesson02._01_variables;

public class VariablesD {

    public static void main(String[] args) {

        // объект класса Student и присвоение значений
        Student studentA = new Student();
        studentA.name = "Денис";
        studentA.age = 21;

        // еще объект класса Student и присвоение значений
        Student studentB = new Student();
        studentB.name = "Анна";
        studentB.age = 19;

        // вывод значений

        System.out.println(studentA.name);
        System.out.println(studentA.age);

        System.out.println(studentB.name);
        System.out.println(studentB.age);

    }
}
