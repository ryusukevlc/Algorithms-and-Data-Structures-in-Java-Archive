import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] a = new int[num];

        int[] b = new int[num];

        for (int i = 0 ; i < a.length ; i++) {
            Random random = new Random();
            a[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(a));
        copy(a, b);
        System.out.println(Arrays.toString(b));


    }

    static void copy(int[] a, int[] b) {

        for (int i = 0 ; i < a.length ; i++) {
            b[i] = a[i];
        }

    }
    
}
