package lesson04.ctrlstmt;

public class CtrlStmtI {

    public static void main(String[] args) {
        int a = 234;
        int b = 154;
        int c = minResult(a, b);
        System.out.println("Минимальное значение = " + c);
    }

    // Возвращает минимум из двух чисел
    private static int minResult(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}
