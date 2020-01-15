import java.util.Scanner;

public class ColdPuterScience {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempCount = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        String temps = in2.nextLine();
        String[] temperatureList = temps.split(" ");
        int negatives = 0;
        for (int i=0; i < tempCount; i++) {
            if(Integer.parseInt(temperatureList[i]) < 0)
            {
                negatives += 1;
            }
        }
        System.out.println(negatives);
    }
}
