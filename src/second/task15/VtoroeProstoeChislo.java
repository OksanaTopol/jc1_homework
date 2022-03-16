package second.task15;

public class VtoroeProstoeChislo {

    public static void main(String[] args) {

        boolean b = true;
        int k = 0;
        for (int P = 50; P <= 70; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b){
                k++;
                if(k==2){
                    System.out.println(P);
                }
              } else {
                b = true;
              }
        }
    }
}
