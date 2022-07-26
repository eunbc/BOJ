import java.io.*;
import java.util.Stack;

public class Main_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            Stack<String> leftSt = new Stack<>();
            Stack<String> rightSt = new Stack<>();

            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                switch (str.charAt(j)) {
                    case '<':
                        if(!leftSt.isEmpty()) rightSt.push(leftSt.pop());
                        break;
                    case '>':
                        if(!rightSt.isEmpty()) leftSt.push(rightSt.pop());
                        break;
                    case '-':
                        if(!leftSt.isEmpty()) leftSt.pop();
                        break;
                    default:
                        leftSt.push(String.valueOf(str.charAt(j)));
                        break;
                }
            }
            while(!leftSt.isEmpty()) rightSt.push(leftSt.pop());
            while(!rightSt.isEmpty()) sb.append(rightSt.pop());
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
