import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++) {
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iterator = list.listIterator();
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                switch (str.charAt(j)) {
                    case '<':
                        if(iterator.hasPrevious()) iterator.previous();
                        break;
                    case '>':
                        if(iterator.hasNext()) iterator.next();
                        break;
                    case '-':
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    default:
                        iterator.add(str.charAt(j));
                        break;
                }
            }
            for(Character ch : list) {
                bw.write(ch);
            }
        }
        bw.close();
    }

}
