import java.util.Arrays;
import java.util.Scanner;

public class Main_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);

        //같은 눈 3개
        if(arr[0]==arr[1] && arr[1]==arr[2]) System.out.println(10000+arr[0]*1000);
        //같은 눈 2개
        else if(arr[0]==arr[1] || arr[1]==arr[2]) {
            System.out.println(1000+arr[1]*100);
        }
        //모두 다른 눈
        else System.out.println(arr[arr.length-1]*100);
    }
}
