import java.io.*;
import java.util.StringTokenizer;

public class DivisorCnt {
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int[] div=new int[n+1];
        int[] sumDiv=new int[n+1];
        boolean[] sieve=new boolean[n+1];
        for(int i=1;i<=n;i++){
                for (int j=i;j<=n;j+=i){
                    ++div[j];
                    sumDiv[j]+=i;
                }
            }
        for(int i=1;i<=n;i++){
            out.print(sumDiv[i]+" ");
        }
        out.flush();
        out.close();
    }
    public static PrintWriter out;
    public static class MyScanner{
        BufferedReader br;
        StringTokenizer st;
        MyScanner(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    st=new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
