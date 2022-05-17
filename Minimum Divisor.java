import java.io.*;
import java.util.StringTokenizer;

public class MinDiv {
    static int MX=20;
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int[] arr=new int[MX+1];
        for(int i=1;i<MX;i++){
            arr[i]=i;
        }
        for(int i=2;i<MX;i++){
            for(int j=i;j<MX;j+=i){
                arr[j]=Math.min(arr[j],i);
            }
        }
        for(int i=1;i<MX;i++){
            out.print(arr[i]+" ");
        }
        out.flush();
        out.close();
    }
    public static PrintWriter out;
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
