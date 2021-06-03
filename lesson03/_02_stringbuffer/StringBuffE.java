package lesson03._02_stringbuffer;

// метод reverse() меняет текущую строку на обратное.
public class StringBuffE {

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Апельсин");
        sb.reverse();
        System.out.println(sb);
    }
}
