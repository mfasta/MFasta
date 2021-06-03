package lesson08;

// Класс с единственной задачей - рассчитать бонус.
public class BonusCalc {

    // метод рассчета бонуса по прогрессивной шкале,
    // в зависимости от объема продаж
    public double calcBonus(int quantity, double price){

        // локальная переменная, получающая рассчетные значения
        // из вне этого класса
        double sales = ProductData.calcSales(quantity, price);

        // локальная переменная
        double bonus;

        // непосредственный рассчет бонуса
        if (sales < 1000){
            bonus = sales * 0.05;
        }else if (sales > 1000 && sales <= 3000){
            bonus = sales * 0.1;
        }else {
            bonus = sales * 0.15;
        }
        // возвращаемое значение данного метода
        return bonus;
    }
}
