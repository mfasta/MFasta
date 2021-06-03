package lesson02._02_types;

// Явное приведение типов в выражениях
public class TypeD {

    public static void main(String[] args) {
        byte b = 27;

        // приведение типа int к byte
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
