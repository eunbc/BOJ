import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main_1406_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i< str.length(); i++) {
            list.add(str.charAt(i));
        }

        ListIterator<Character> iterator = list.listIterator();

        //커서를 맨 뒤로 이동시킴
        while(iterator.hasNext()) {
            iterator.next();
        }

        for(int i=0; i<n; i++) {
            String command = br.readLine();
            switch(command.charAt(0)) {
                case 'L':
                    if(iterator.hasPrevious()) iterator.previous();
                    break;
                case 'D':
                    if(iterator.hasNext()) iterator.next();
                    break;
                case 'B':
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case 'P':
                    iterator.add(command.charAt(2));
                    break;
                default:
                    break;
            }
        }

        for(Character chr : list) {
            bw.write(chr);
        }
        bw.flush();
        bw.close();

    }
}
