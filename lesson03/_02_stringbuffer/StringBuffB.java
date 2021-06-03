package lesson03._02_stringbuffer;

// метод insert() вставляет определенную строку
// в заданную позицию.
public class StringBuffB {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Апельсин ");
        sb.insert(2,"Кот");
        System.out.println(sb);
    }
}
