package first.task10;

public class Main {
    public static void main(String[] args) {

        int e = 5, f = 6, a = 1, b = 6, c = 1, d = 1;

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("Можно построить 2 дома");
        }
        else
            System.out.println("Нельзя построить 2 дома");
    }
}
