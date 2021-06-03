package lesson07.overloadz;

public class OverloadBA {

    public static void main(String[] args){

        OverloadB aaa = new OverloadB();

        System.out.println(aaa.sum(15,21));

        System.out.println(OverloadB.sum(31,18,44));
    }
}
