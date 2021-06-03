package lesson02._02_types;

public class TypeE {

    public static void main(String[] args) {

        byte b1 = 23;
        byte b2 = -12;

        // Ошибка компиляции.
        // Несовместимость типов, результат
        // операции тип int, а не short.
//        short res = b1 + b2;
//        System.out.println("value = " + res);

        // В выражениях совмещенного присваивания (+=,-=,*=,/=)
        // приведение происходит автоматически.
        b1 += b2; // <- аналогично b1 = b1 + b2;
        System.out.println("value = " + b1);

    }
}
