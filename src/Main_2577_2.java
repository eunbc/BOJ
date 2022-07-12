import java.util.Scanner;

public class Main_2577_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int[] arr = new int[10];
        for(int i=0; i<3; i++) {
            num *= sc.nextInt();
        }
        while(num > 0) {
            arr[num%10]++;
            num/=10;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
