import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] intArray = new int[num];

        Random random = new Random();
        
        for (int i = 0 ; i < intArray.length ; i++) {
            intArray[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(intArray));

        for (int i = 0 ; i < intArray.length / 2 ; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
            System.out.println(Arrays.toString(intArray));
        }

        sc.close();

    }
}