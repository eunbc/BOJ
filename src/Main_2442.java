import java.util.Scanner;

public class Main_2442 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int k=n-i; k>1; k--) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
