package lesson09.classez.demoa;

// Инициализация объекта через ссылочную переменную.

public class StudentA {

    public static void main(String[] args){
        Student student = new Student();
        student.id = 153;
        student.name = "Григорий";
        System.out.println(student.id + " " + student.name);
    }
}
