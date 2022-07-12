import java.util.Arrays;
import java.util.Scanner;

public class Main_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[10];
        int res;
        while(num>0){
            arr[num%10]++;
            num /= 10;
        }

        int sixnine = (arr[6] + arr[9] + 1) / 2;
        arr[6] = 0;
        arr[9] = 0;
        Arrays.sort(arr);
        if(sixnine > arr[arr.length-1]) {
            res = sixnine;
        } else {
            res = arr[arr.length-1];
        }
        System.out.println(res);

    }
}
