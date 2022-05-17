import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.StringTokenizer;
import java.util.Vector;

public class PrimeFactorization {
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        Instant start=Instant.now();
        int[] spf=new int[n+1];
        for(int i=1;i<=n;i++){
            spf[i]=i;
        }
        for(int i=2;i<=n;i++){
            for (int j=i;j<=n;j+=i){
                spf[j]=Math.min(spf[j],i);
            }
        }
        Vector<Integer>vec=new Vector<>();
        while(n>1){
           vec.add(spf[n]);
           n/=spf[n];
        }
        for (Integer x:vec){
            out.print(x+" ");
        }
        out.println();
        Instant end=Instant.now();
        out.println(Duration.between(start,end));
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
