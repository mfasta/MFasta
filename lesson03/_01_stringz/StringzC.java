package lesson03._01_stringz;

// Метод charAt() возвращает символ по указанному индексу в строке.
// Первый символ имеет индекс 0, а последний - длина строки - 1.
public class StringzC {

    public static void main(String[] args) {
        String str = "Java курсы";

// вывод первого символа строки
        System.out.println(str.charAt(0));

// вывод символа на определенном индексе
        System.out.println(str.charAt(6));

// вывод последнего символа строки
        System.out.println(str.charAt(str.length() - 1));
    }
}
