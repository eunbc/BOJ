import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 1;
        int[] arr = new int[10];
        for(int i=0; i<3; i++) {
            num *= sc.nextInt();
        }
        String number = String.valueOf(num);
        System.out.println(number);
        for(int i=0; i<number.length(); i++) {
            for(int j=0; j<arr.length; j++) {
                if(String.valueOf(j).equals(number.substring(i,i+1))) arr[j]++;
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
