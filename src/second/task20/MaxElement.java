package second.task20;

public class MaxElement {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
           if (max < myArray[i]){
            max = myArray[i];
               System.out.println("Индекс максимального элемента: " + i);
            }
        }
        System.out.println("Максимальное значение в массиве myArray: " + max);
    }
}
