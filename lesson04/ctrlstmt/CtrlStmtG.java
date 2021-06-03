package lesson04.ctrlstmt;

public class CtrlStmtG {

    public static void main(String[] args) {

//      String product = "яблоко";
//      String product = "груша";
        String product = "апельсин";
//      String product = "батон";

        switch (product) {
            case "яблоко", "груша", "слива" ->
                    System.out.println("Фрукты");
            case "апельсин", "лимон" ->
                    System.out.println("Цитрусовые");
            default ->
                    System.out.println("Неопределено");
        }
    }
}
