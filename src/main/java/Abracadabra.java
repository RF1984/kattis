/**
 * https://open.kattis.com/problems/timeloop
 */

import java.util.Scanner;

public class Abracadabra {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int um = 1;
        String abracadabra = "Abracadabra";
        while(input<=100 && input>=1 && um <= input)
        {
            System.out.println(um + " " + abracadabra);
            um++;
        }
    }
}
