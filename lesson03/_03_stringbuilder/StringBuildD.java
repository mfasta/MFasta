package lesson03._03_stringbuilder;

// метод delete() класса удаляет строку по указанным
// начальному и конечному индексу (от и до)
public class StringBuildD {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Апельсин");
        sb.delete(2,4);
        System.out.println(sb);
    }
}
