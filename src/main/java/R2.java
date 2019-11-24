import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String val = in.nextLine();
        String[] input = val.split(" ");
        int r1 = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int r2 = S * 2 - r1;
        System.out.println(r2);
    }
}
