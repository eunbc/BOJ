import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Main_1406_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        Stack<String> leftSt = new Stack<>();
        Stack<String> rightSt = new Stack<>();

        String[] arr = str.split("");
        for(String s : arr) {
            leftSt.push(s);
        }

        for(int i=0; i<n; i++) {
            String command = sc.next();
            switch(command.charAt(0)) {
                case 'L':
                    if(!leftSt.isEmpty()) rightSt.push(leftSt.pop());
                    break;
                case 'D':
                    if(!rightSt.isEmpty()) leftSt.push(rightSt.pop());
                    break;
                case 'B':
                    if(!leftSt.isEmpty()) {
                        leftSt.pop();
                    }
                    break;
                case 'P':
                    leftSt.push(sc.next());
                    break;
                default:
                    break;
            }
        }
        while(!leftSt.isEmpty()) rightSt.push(leftSt.pop());
        while(!rightSt.isEmpty()) System.out.print(rightSt.pop());
    }
}
