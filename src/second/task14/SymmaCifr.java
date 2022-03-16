package second.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmaCifr {

    public static void main(String[] args) throws IOException {

        String s;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        s = bf.readLine();
        for (int i = 3; i < s.length(); i+=3){
            if (s.length() - i >= i/3){
                String before = s.substring(0, i + (i/3 - 1));
                String after = s.substring(i + (i/3 - 1), s.length());
                s = before + " " + after;
            }
        }

        System.out.println(s);
    }
}
