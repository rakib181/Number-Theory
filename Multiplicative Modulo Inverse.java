import java.io.*;
import java.util.StringTokenizer;

public class MMI {
    static Triplet ExtendedEuclide(int a,int m){
        if(m==0){
            Triplet ans=new Triplet(0,0,0);
            ans.x=1;
            ans.y=0;
            ans.gcd=a;
            return ans;
        }
        Triplet ans=ExtendedEuclide(m,a%m);
        Triplet fi=new Triplet(0,0,0);
        fi.x=ans.y;
        fi.y=ans.x-(a/m)*ans.y;
        fi.gcd=ans.gcd;
        return fi;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        Triplet t=new Triplet(0,0,0);
        int a=sc.nextInt(),m=sc.nextInt();
        Triplet x=ExtendedEuclide(a,m);
        if(x.gcd!=1){
            out.println("Doesn,t Exist !");
        }else{
            out.println(x.x);
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
    public static class Triplet{
        int x,y,gcd;
        Triplet(int _x,int _y,int _gcd){
            this.x=_x;
            this.y=_y;
            this.gcd=_gcd;
        }
    }
}
