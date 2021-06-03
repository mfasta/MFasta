package lesson11.extendz.demoa;

public class Person {

    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void display() {
        System.out.println("Имя: " + name);
    }
}
