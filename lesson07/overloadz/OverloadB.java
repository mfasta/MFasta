package lesson07.overloadz;

public class OverloadB {

    int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
