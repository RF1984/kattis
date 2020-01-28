import java.util.Arrays;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String values = in.nextLine();
        int[] piecesInt = Arrays.stream(values.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] total = {1,1,2,2,2,8};
        int[] output={0,0,0,0,0,0};
        for (int i=0; i < 6; i++) {

                output[i] = total[i] - piecesInt[i];
        }
        /**
         * this line prints the values, one in each line, without the []
         */
        Arrays.stream(output).forEach(System.out::println);
    }
}
