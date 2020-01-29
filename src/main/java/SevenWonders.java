import java.util.Arrays;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/sevenwonders
 */
public class SevenWonders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String [] total = input.split("(?!^)");
        //Arrays.stream(total).forEach(System.out::println);
        int t = 0;
        int c = 0;
        int g = 0;
        for (int i=0; i < total.length; i++) {

            if(total[i].equals("T"))
            {
                t += 1;
            }
            else if(total[i].equals("C"))
            {
                c += 1;
            }
            else if(total[i].equals("G"))
            {
                g += 1;
            }
        }
        int points = (t*t)+(c*c)+(g*g);
        int min = Math.min(Math.min(t, c), g);
        int extraPoints = min*7;
        int finalPoints = points + extraPoints;
        System.out.println(finalPoints);
    }
}
