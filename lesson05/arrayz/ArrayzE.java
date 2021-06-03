package lesson05.arrayz;

// Объявление массива элементов типа char, с первоначальным
// набором символов.
// Используется метод System.arraycopy для копирования
// подпоследовательности компонентов массива во второй массив.
public class ArrayzE {

    public static void main(String[] args) {

        char[] copyFrom = { 'у', 'л', 'я', 'б', 'л', 'о', 'к',
                'о', 'с', 'л', 'и', 'в', 'а' };
        char[] copyTo = new char[6];

        System.arraycopy(copyFrom, 2, copyTo, 0, 6);
        System.out.println(new String(copyTo));
    }
}
