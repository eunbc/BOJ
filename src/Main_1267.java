import java.util.Scanner;

public class Main_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int Y = 0;
        int M = 0;
        for(int i=0; i<N; i++) {
            Y += (arr[i]/30+1)*10;
            M += (arr[i]/60+1)*15;
        }

        if(Y>M) System.out.println("M "+M);
        else if(Y<M) System.out.println("Y "+Y);
        else System.out.println("Y M "+M);
    }
}
