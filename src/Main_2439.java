import java.util.Scanner;

public class Main_2439 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<n+1; i++) {
            for(int k=n; k>i; k--) {
                System.out.print(" ");
            }
            for(int j=1; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
