package lesson11.overridez.demoa;

public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void display() {
        System.out.println("Имя: " + name);
    }

}
