import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        Random rnd = new Random();
        int k = in.nextInt(), n = in.nextInt(), m[][] = new int[k][n], sum1 = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            for (int y = 0; y < n; y++) {
                m[i][y] = in.nextInt();
                sum1 += m[i][y];
            }
            out.println(sum1);
            sum += sum1;
            sum1 = 0;
        }
        int s[][] = new int[sum][sum];
        for (int i = 0; i < sum; i++) {
            for (int y = 0; y < sum; y++) {
                s[i][y] = rnd.nextInt();
                out.print(s[i][y]+" ");
            }
            out.println();
        }
    }
}
