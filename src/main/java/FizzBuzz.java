/**
 * https://open.kattis.com/problems/fizzbuzz
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputList = input.split(" ");
        int x = Integer.parseInt(inputList[0]);
        int y = Integer.parseInt(inputList[1]);
        int n = Integer.parseInt(inputList[2]);

        for (int i=1; i<= n; i++) {
            if (i % y == 0 && i % x == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % x == 0) {
                System.out.println("Fizz");
            }
            else if (i % y == 0) {
                System.out.println("Buzz");
            }

            else System.out.println(i);
        }

    }
}