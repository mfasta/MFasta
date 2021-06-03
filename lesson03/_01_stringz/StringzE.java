package lesson03._01_stringz;

// Метод contains() ищет последовательность символов в строке.
// Возвращает true, если в этой строке найдена последовательность
// значений char, в противном случае возвращает false.
public class StringzE {

    public static void main(String[] args) {

        String str = "Java курсы - это класс";
        System.out.println(str.contains("Java курсы"));
        System.out.println(str.contains("курсы - это"));
        System.out.println(str.contains("погода - хорошая"));
    }
}
