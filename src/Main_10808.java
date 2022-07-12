import java.util.Scanner;

public class Main_10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i = 0; i<s.length(); i++) {
            String ss = s.substring(i,i+1);
            for(int j = 0; j<alphabet.length; j++) {
                if(ss.equals(alphabet[j])) arr[j]++;
            }
        }

        for(int i =0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
