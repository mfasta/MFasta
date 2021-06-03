package lesson05.arrayz;

// проход по массиву
public class ArrayzF {

    public static void main(String[] args) {

        // проход через while
        int[] arr01 = {8, 12, 3, 9};

        int i = 0;
        while(i < arr01.length) {
            System.out.println(arr01[i]);
            i++;
        }

        // просто разделитель
        System.out.println("---------------");

        // проход через do-while
        int[] arr02 = {4, 15, 6, 7};

        if(arr02.length > 0) {
            int j = 0;
            do{
                System.out.println( arr02[j] );
                j++;
            }while(j < arr02.length);
        }

        System.out.println("---------------");

        // проход через for
        int[] arr03 = {17, 8, 26, 13};
        for(int x = 0 ; x < arr03.length; x++) {
            System.out.println( arr03[x] );
        }

        System.out.println("---------------");

        // проход через for-each
        int[] arr04 = {9, 14, 21, 8};
        int count = 1; // счетчик
        for(int y : arr04) {
            System.out.println(count + ". Значение: " + y);
            count++;
        }

        System.out.println("---------------");

        String[] arr05 = {"Слива", "Апельсин", "Яблоко", "Груша"};
        for(String y : arr05) {
            System.out.println(y);
        }

    }
}
