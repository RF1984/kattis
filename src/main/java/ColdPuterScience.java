import java.util.Arrays;
import java.util.Scanner;

public class ColdPuterScience {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempCount = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        String temps = in2.nextLine();
        int[] tempInt = Arrays.stream(temps.split(" ")).mapToInt(Integer::parseInt).toArray();
        int negatives = 0;
        for (int i=0; i < tempCount; i++) {
            if(tempInt[i] < 0)
            {
                negatives += 1;
            }
        }
        System.out.println(negatives);
    }
}
