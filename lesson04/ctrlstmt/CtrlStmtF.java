package lesson04.ctrlstmt;

public class CtrlStmtF {

    public static void main(String[] args) {

        int boxPlan = 13;
        int boxFact = 23;

        System.out.println("Результат:");
        if (boxFact < boxPlan)
            System.out.println("Недопоставка. Поставлено " + boxFact + " штук");
        else if (boxFact > boxPlan)
            System.out.println("Больше. Поставлено " + boxFact + " штук");
        else if (boxFact == boxPlan)
            System.out.println("По договору. Поставлено " + boxFact + " штук");
    }
}
