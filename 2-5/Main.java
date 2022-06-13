import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] b = new int[num];
        int[] a = new int[num];

        for (int i = 0 ; i < b.length ; i++) {
            Random random = new Random();
            b[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(b));
        rcopy(b, a);
        System.out.println(Arrays.toString(a));


        sc.close();
    }

    private static void rcopy(int[] b, int[] a) {

        for (int i = 0 ; i < b.length ; i++) {
            a[i] = b[b.length - 1 - i];
        }

    }
    
}
