import java.io.*;
import java.util.StringTokenizer;

public class ModuloInv {
    static int MOD=107;
    static long pow(int b,int m){
        if(m==0){
            return 1;
        }
        long res=pow(b,m/2);
        if((m&1)==1){
            return (res*res*b)%MOD;
        }else{
            return (res*res)%MOD;
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int a=sc.nextInt(),b=sc.nextInt();
        out.println((a*pow(b,MOD-2))%MOD);
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
