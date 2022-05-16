import java.io.*;
import java.util.StringTokenizer;

public class MillerRobinPrimality {
    static long binPow(int a,int d,int n){
        if(d==0){
            return 1;
        }
        long res=binPow(a,d/2,n);
        if((d&1)==1){
            return (res*res*a)%n;
        }
        return (res*res)%n;
    }
    static boolean millerRobinTry(int d,int n){
        int a=(int)(2+Math.random()%(n-4));
        int x= (int) binPow(a,d,n);
        if(x==1 || x==n-1){
            return true;
        }
        while (d!=n-1){
            x=(x*x)%n;
            d<<=1;
            if(x==1){
                return false;
            }
            if(x==n-1)return true;
        }
        return false;
    }
    static boolean _isPrime(int n,int k){
        if(n<=1 || n==4){
            return false;
        }
        if(n<=3)return true;
        int d=n-1;
        while (d%2==0){
            d>>=1;
        }
        for(int i=0;i<k;i++){
            if(!millerRobinTry(d,n)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt(),k=4;
        for(int i=1;i<=n;i++){
            if(_isPrime(i,k)){
                out.print(i+" ");
            }
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
