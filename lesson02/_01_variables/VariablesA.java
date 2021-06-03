package lesson02._01_variables;

public class VariablesA {

    public static void main(String[] args) {

// объявление переменной
        int x;
// присвоения значения
        x = 12;

// объявление и инициализация переменной
        int y = 15;
        float z = 13.56f;
        double someD = 13.346785;
        String str = "Это значение переменной!";

// Через запятую можно объявить сразу несколько переменных
// одного типа
        int a, b;
        a = 17;
        b = 29;

// Также можно сразу инициализировать переменные
        int c = 9, d = 16;


// Разница между String и char.
// char - один символ. String - ноль или более символов.
// char является примитивным типом. String - класс.

// можно в двойных кавычках
        String var0 = "";
        String var1 = "я";

        String var2 = "Яблоко";

//         ошибка компиляции, переменную надо
//         инициализировать, т.к. используется
//         далее при выводе, также - декларация в методе
//         String var2;


// нельзя в одинарных кавычках, т.к. String
//       String var11 = 'я';
//       String var21 = 'Яблоко';

// можно в одинарных кавычках
        char var3 = 'я';

// нельзя в двойных кавычках, т.к. char
//        char var4 = "я";
//        char var5 = "Яблоко";


// вывод данных ----------------

        System.out.println(var2);

        System.out.println(y);

        System.out.println(z);

        System.out.println(someD);

        System.out.println(str);

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        System.out.println(d);

    }
}
