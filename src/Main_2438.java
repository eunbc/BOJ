import java.io.*;

public class Main_2438 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<i+1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }


}
