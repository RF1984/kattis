import java.util.Scanner;

public class TwoStones {
    public static void main(String[] args) {
        int stone;
        Scanner in = new Scanner(System.in);
        stone = in.nextInt();
        if(stone % 2 == 0)
        {
            System.out.println("Bob");
        }
        else System.out.println("Alice");
    }
}
