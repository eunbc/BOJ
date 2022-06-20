import java.util.Arrays;
import java.util.Scanner;

public class Main_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[12];
        for(int i=0; i<12; i++) {
            array[i] = sc.nextInt();
        }

        play(Arrays.copyOfRange(array,0,4));
        play(Arrays.copyOfRange(array,4,8));
        play(Arrays.copyOfRange(array,8,12));
    }

    //윷놀이
    private static void play(int[] arr) {
        int k = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) k++;
        }

        switch (k) {
            case 3:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 1:
                System.out.println("C");
                break;
            case 0:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
        }
    }

}
