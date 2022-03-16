package second.task21;

public class SumElements {
    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }

        int min = myArray[0];
        for(int i=1;i<10;i++) {
            if(myArray[i]<min) {
                min=myArray[i];
            }
        }
        int minIndex = 0;
        for(int i=0;i<10;i++) {
            if(myArray[i] == min) {
                minIndex = i;
                break;
            }
        }
        int max = myArray[0];
        for(int i=1;i<10;i++) {
            if(myArray[i]>max) {
                max=myArray[i];
            }
        }
        int maxIndex = 9;
        for(int i=9;i>0;i--) {
            if(myArray[i] == max) {
                maxIndex = i;
                break;
            }
        }

        System.out.println();

        int sum = 0;
        if (minIndex < maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                sum = sum + myArray[i];
            }
        } else {
            for (int i = maxIndex; i <= minIndex; i++) {
                sum = sum + myArray[i];
            }
        }

        System.out.println(sum);

    }
}
