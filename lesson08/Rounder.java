package lesson08;

import java.text.DecimalFormat;

// Класс с единственной задачей - округлять значения
// по шаблону.
public class Rounder {
    // Метод для округления значений.
    public static String roundValue(double value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
