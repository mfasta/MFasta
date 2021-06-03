package lesson03._01_stringz;

// Метод replace() возвращает строку, заменяющую все старые
// символы char или CharSequence на новые char или CharSequence.
//
// Метод replaceAll() возвращает строку, заменяющую всю последовательность
// символов, соответствующих шаблону.
public class StringzF {

    public static void main(String[] args) {

        // замена символа
        String str1 = "прога - класс";
        String str2 = str1.replace('г','м');
        System.out.println(str2);

        // замена последовательности символов
        String str3 ="апельсин на столе";
        String str4 = str3.replace("апельсин","яблоко");
        System.out.println(str4);

        // замена всех символов по шаблону
        String str5 = "апельсин на столе";
        String a = "а";
        String str6 = str5.replaceAll(a,"о");
        System.out.println(str6);

        // замена последовательности всех символов по шаблону
        String str7 = "было светло, было тепло";
        String str8 = str7.replaceAll("было","сейчас");
        System.out.println(str8);

    }
}
