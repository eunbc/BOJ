import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        int b = 0;
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                if(sum -arr[i] -arr[j]==100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(i == a || i ==b) continue;
            System.out.println(arr[i]);
        }
    }

}
