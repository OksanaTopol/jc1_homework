package second.task12;

public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        int i = 0;
        long factorial = 1;
        while (i <= num) {
            if(i==0){
                factorial = 1;
            } else {
                factorial *= i;
            }
            i++;
            System.out.println("Factorial of " + (i-1) + " = " + factorial);
        }
    }
}
