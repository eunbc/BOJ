import java.util.Scanner;

public class Main_3273 {
    //시간 초과
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                if(arr[i]+arr[j] == x) count++;
            }
        }
        System.out.println(count);
    }

}
