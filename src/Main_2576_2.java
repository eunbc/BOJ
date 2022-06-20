import java.util.Scanner;

public class Main_2576_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int sum = 0;
        int min = 100;
        for(int i=0; i< array.length;i++) {
            array[i] = sc.nextInt();
            if(array[i]%2==1) {
                sum += array[i];
                if(array[i]<min) min = array[i];
            }
        }


        if(sum==0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
