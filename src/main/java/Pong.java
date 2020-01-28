
import java.util.Random;
import java.util.Scanner;

public class Pong {

        public static void main(String[] args) {
            Random rand = new Random();
            int n = rand.nextInt(50);
            if(n % 2 == 0)
            {
                System.out.println("Pong");
            }
            else System.out.println("Other");
        }
    }
