package lesson03._01_stringz;

public class StringzA {

    public static void main(String[] args) {

        String strA = "Просто строка";
        System.out.println(strA);

        // конкатенация через символ +
        String strB = "Очень длинная строка нашего текста, "
                + "необходимо конкатенировать, т.е. объединять, "
                + "поэтому, следите за пробелами.";
        System.out.println(strB);

        // конкатенация через метод concat()
        String strC = "Просто ";
        String strD = strC.concat("строка");
        System.out.println(strD);

        // конкатенация цепочкой
        System.out.println( "Просто".concat(" ").concat("строка") );

        // Узнаем длину строки
        String strE = "Наша строка!";
        System.out.println("Длина строки - " + strE.length());

    }
}
