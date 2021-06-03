package lesson03._02_stringbuffer;

// метод delete() класса удаляет строку по указанным
// начальному и конечному индексу (от и до)
public class StringBuffD {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Апельсин");
        sb.delete(2,4);
        System.out.println(sb);
    }
}
