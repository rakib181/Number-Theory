import java.io.*;
import java.util.StringTokenizer;

public class EulerTotientFunction {
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int[] totient=new int[n+1];
        for(int i=1;i<=n;i++){
            totient[i]=i;
        }
        for(int i=2;i<n;i++){
            if(totient[i]==i){
                totient[i]=i-1;
                for(int j=2*i;j<=n;j+=i){
                    totient[j]*=i-1;
                    totient[j]/=i;
                }
            }
        }
        for(int i=1;i<=n;i++){
            out.print(totient[i]+" ");
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
