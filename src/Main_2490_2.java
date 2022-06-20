import java.util.Scanner;

public class Main_2490_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] res = {"D","C","B","A","E"};
        for(int i=0; i<3;i++) {
            int result = 0;
            for(int j=0;j<4;j++) {
                result += sc.nextInt();
            }
            System.out.println(res[result] + " ");
        }
    }

}
