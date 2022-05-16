import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class PrimeFactorizationSqrtn {
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        Vector<Integer>vec=new Vector<>();
        for(int i=2;i*i<=n;i++){
            while (n%i==0){
                vec.add(i);
                n/=i;
            }
        }
        if(n>1){
            vec.add(n);
        }
        for (int x:vec){
            out.print(x+" ");
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
