package second.task13;

public class Proizvedenie {

    public static void main(String[] args) {
        int i = 1;
        int result = 1;

        do {
            result *= i;
            i++;
        } while (i <= 25);
        System.out.println("Произведение чисел от 1 до 25: " + result);
    }
}
