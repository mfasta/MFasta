package lesson10.constructorz.demoa;

// Модификатор доступа private
// применен к полям.
// Модификатор public установлен на
// геттеры (get) и сеттеры (set).

public class EmployeeE {

    private String name;
    private String position;
    private int hours;
    private float tariff;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getTariff() {
        return tariff;
    }

    public void setTariff(float tariff) {
        this.tariff = tariff;
    }

}
