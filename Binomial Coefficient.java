import java.io.*;
import java.util.StringTokenizer;

public class BinomialCoefficient {
    static int MOD=1000000007;
    static long modInv(long a,int b){
        if(b==0){
            return 1;
        }
        long res=modInv(a,b/2);
        if((b&1)==1){
            return (res*res*a)%MOD;
        }else{
            return (res*res)%MOD;
        }
    }
    static long FACT(int n){
        if(n==1){
            return 1;
        }
        return (n%MOD)*FACT(n-1);
    }
    static long computeNcR(long n,long r,long nr,int m){
        long rInv=modInv(r,m-2);
        long nrInv=modInv(nr,m-2);
        return (n%MOD*rInv%MOD*nrInv%MOD)%MOD;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),r= sc.nextInt();
        long NFACT=FACT(n);
        long RFACT=FACT(r);
        long NRFACT=FACT(n-r);
        out.println(computeNcR(NFACT,RFACT,NRFACT,MOD));
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
