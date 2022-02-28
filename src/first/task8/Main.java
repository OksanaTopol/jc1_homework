package first.task8;

public class Main {

    int sum;

    public static void main(String[] args){

        vyvodSymmy(4378);

    }
    public static void vyvodSymmy(int sum){
        int lastCharacter = sum % 10;
        if (lastCharacter == 0){
            System.out.println(sum + " рублей.");
        } else if (lastCharacter < 5){
            System.out.println(sum + " рубля.");
        } else {
            System.out.println(sum + " рублей.");
        }
    }
}
