/**
 * https://open.kattis.com/problems/autori
 */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Autori {
    private String outPutString;

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        String outPutString = new String();
        for(int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c))
            {
                outPutString += c;
            }
        }
        System.out.println(outPutString);

    }
}
