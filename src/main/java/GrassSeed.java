/**
 * https://open.kattis.com/problems/grassseed
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class GrassSeed {

    public static void main(String[] args) {
        double totalCost = 0.0;
        Scanner in = new Scanner(System.in);
        double seedCost = Double.parseDouble(in.nextLine());
        int size = in.nextInt();
        in.nextLine();
        for (int i=0; i<size; i++)
            {
                String wl = in.nextLine();
                String[] area = wl.split(" ");
                double width = Double.parseDouble(area[0]);
                double length = Double.parseDouble(area[1]);
                double total = (width*length)*seedCost;
                totalCost += total;

            }
            DecimalFormat df = new DecimalFormat("#.0000000");
            System.out.println(df.format(totalCost).replace(",","."));
        }
    }