import java.util.Scanner;

public class Main_3273_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] occur = new boolean[2000001];
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(x-a[i] > 0 && occur[x-a[i]]) count++;
            occur[a[i]] = true;
        }
        //순서가 바뀌면 왜 arrayIndexOutOfBounds 에러가 날까?
        System.out.println(count);
    }

}
