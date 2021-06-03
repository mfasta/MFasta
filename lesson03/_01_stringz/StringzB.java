package lesson03._01_stringz;

// Сравнение строк
public class StringzB {

    public static void main(String[] args) {

        String str1 = "Апельсин";
        String str2 = "Апельсин";
        String str3 = "Картофель";

        // Метод equals() сравнивает исходное содержимое строки.
        // Он сравнивает значения строки на предмет равенства.
        // Сравнивает строку с указанным объектом.
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        // equalsIgnoreCase() сравнивает строку с другой строкой,
        // игнорируя регистр.
        String str4 = "АПЕЛЬСИН";
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        // Оператор == сравнивает ссылки, а не значения.
        String str5 = "Груша";
        String str6 = "Груша";
        String str7 = new String("Груша");
        // true (оба относятся к одному и тому же экземпляру)
        System.out.println(str5 == str6);
        // false (относятся к разным экземплярам)
        System.out.println(str5 == str7);

        // Метод compareTo() сравнивает значения лексикографически и
        // возвращает целочисленное значение, которое описывает, если
        // первая строка меньше, равна или больше второй строки.
        String str8 = "Апельсин";
        String str9 = "Апельсин";
        String str10 = "Груша";
        System.out.println(str8.compareTo(str9)); // 0
        System.out.println(str8.compareTo(str10)); // -x
        System.out.println(str10.compareTo(str8)); // +x

    }
}
