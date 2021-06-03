package lesson03._01_stringz;

public class StringzG {

    public static void main(String[] args) {

        // Метод toLowerCase() возвращает строку в нижнем регистре.
        String str1 = "АПЕЛЬСИН на столе";
        String str2 = str1.toLowerCase();
        System.out.println(str2);

        // Метод toUpperCase() возвращает строку в верхнем регистре.
        String str3 = "апельсин НА СТОЛЕ";
        String str4 = str3.toUpperCase();
        System.out.println(str4);

    }
}
