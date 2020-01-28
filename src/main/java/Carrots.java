/**
 * https://open.kattis.com/problems/carrots
 */
import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String [] inputList = input.split(" ");
        int contest = Integer.parseInt(inputList[0]);
        int problems = Integer.parseInt(inputList[1]);
        for (int i=1; i<= contest; i++) {
            Scanner in2 = new Scanner(System.in);
            String input2 = in.nextLine();
        }
        System.out.println(problems);
    }
}
