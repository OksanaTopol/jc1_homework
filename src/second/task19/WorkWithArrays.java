package second.task19;

public class WorkWithArrays {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();
        for (int i = 2; i < myArray.length; i = i + 2){
            System.out.print(myArray[i] + ", ");

        }

    }

}
