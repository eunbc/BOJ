import java.io.*;
import java.util.StringTokenizer;

public class Main_15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(bf.readLine());
            bw.write(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()) + "\n");
        }
        bw.close();
    }

}
