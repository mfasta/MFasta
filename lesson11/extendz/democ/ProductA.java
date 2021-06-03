package lesson11.extendz.democ;


public class ProductA extends Product {

    private double price;

    public ProductA(String name, int quantity, double price) {
        super(name, quantity);
        this.price = price;
    }

    public void infoSale() {

        double totalSale = calculateTotalSale(getQnty(),price);
        String saleResult = Rounder.roundValue(totalSale);

        System.out.println(
                "Информация о продаже" +
                "\n-----------------------------" +
                "\nТовар: " + getName() +
                "\nКоличество (кг): " + getQnty() +
                "\nСумма продажи (грн.): " + saleResult +
                "\n-----------------------------"
            );
    }

    private static double calculateTotalSale(int quota, double price){
        return quota * price;
    }
}
