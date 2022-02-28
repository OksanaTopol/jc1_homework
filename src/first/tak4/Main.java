package first.tak4;

public class Main {

    int a, b;

    public static void main(String[] args){

        System.out.println(calculator(6,8));

    }

    public static int calculator(int a,int b){

        int k = (a + b) + a * b;
        return k;
    }

}
