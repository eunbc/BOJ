import java.util.Scanner;

public class Main_2562 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        int order = 0;

        for(int i=1; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                order = i;
            }
        }
        System.out.println(max);
        System.out.println(order);
    }

}
