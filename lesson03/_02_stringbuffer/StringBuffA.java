package lesson03._02_stringbuffer;

// изменение строки через append()
public class StringBuffA {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Апельсин ");
        sb.append("очень вкусный");
        System.out.println(sb);
    }
}
