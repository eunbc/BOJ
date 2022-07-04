import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_10804 {
    static int[] arr = new int[21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<21; i++) {
            arr[i] = i;
        }

        for(int i=0; i<10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            reverse(a,b);
        }

        for(int i=1; i<21; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int a, int b) {
        List<Integer> list = new ArrayList<>();
        for(int j=a; j<b+1 ; j++) {
            list.add(arr[j]);
        }
        Collections.reverse(list);

        for(int i=a; i<b+1; i++) {
            arr[i] = list.get(i-a);
        }
    }
}
