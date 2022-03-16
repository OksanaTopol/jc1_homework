package second.task18;

public class VariableForArray {

    public static void main(String[] args) {
        int marks[] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(marks[9]);
    }

}
