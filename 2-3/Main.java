import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();

        int[] intArray = new int[all];

        Random random = new Random();

        for (int i = 0 ; i < all ; i++) {
            intArray[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(intArray));

        System.out.println(sum(intArray));

        sc.close();
    }

    private static int sum(int[] intArray) {

        int total = 0;

        for (int i = 0 ; i < intArray.length ; i++) {
            total += intArray[i];
        }

        return total;

    }
    
}
