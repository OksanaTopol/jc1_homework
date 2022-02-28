package first.task7;

public class Main {

    int a, b, r;
    static boolean c;

    public static void main(String[] args){


        System.out.println(zakroetLiOtverstie(4,3, 5));
    }
    public static boolean zakroetLiOtverstie(int a, int b, int r){
        double diagonalPrjamoygolnika = Math.sqrt(a * a + b * b);
        int diagonalKryga = 2 * r;
        if (diagonalPrjamoygolnika > diagonalKryga){
            c = false;
            System.out.println("Не закроет");
        }
        else{
            c = true;
            System.out.println("Закроет");
        }
        return c;
    }

}
