package first.task5;

public class Main {

    public static void main(String[] args){

        int s = 3700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 60;
        int d = (h - hours) / 24;
        int days = d % 24;
        int w = (d - days) / 7;
        int weeks = w % 7;

        System.out.println( h + " часов, " + min + " минут, " + sec + " секунд, " + d + " суток, " + w + " недель.");
    }

}
