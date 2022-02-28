package first.task6;

public class Main {

    int a;
    static boolean b;

    public static void main(String[] args){

        System.out.println(isLastNumberSeven(25626));
    }
    public static boolean isLastNumberSeven(int a){
        int lastCharacter = a%10;
        if (lastCharacter == 7){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }
}
