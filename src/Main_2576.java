import java.util.Arrays;
import java.util.Scanner;

public class Main_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int sum = 0;
        int min = 0;
        for(int i=0; i< array.length;i++) {
            array[i] = sc.nextInt();
            if(array[i]%2==1) sum += array[i];
        }

        Arrays.sort(array);
        for(int i=0; i< array.length;i++) {
            if(array[i]%2==1) {
                min = array[i];
                break;
            }
        }

        if(sum==0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
