import java.io.*;
import java.util.StringTokenizer;

public class LinearDiophantineEqn {
    static Triplet EEuclid(int x,int y){
        if(y==0){
            Triplet ans=new Triplet(0,0,0);
            ans.x=1;
            ans.y=0;
            ans.gcd=x;
            return ans;
        }
        Triplet ans=EEuclid(y,x%y);
        Triplet yo=new Triplet(0,0,0);
        yo.x=ans.y;
        yo.y=ans.x-(x/y)*ans.y;
        yo.gcd=ans.gcd;
        return yo;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        Triplet t=new Triplet(0,0,0);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a==0 && b==0){
            if(c==0){
                out.println("Infinite Solutions Exists !");
            }else{
                out.println("No Solution Exists !");
            }
        }
        Triplet x=EEuclid(a,b);
        if(c%x.gcd!=0){
            out.println("Solution Doesn't Exists !");
        }else{
            out.println("x : "+x.x*(c/x.gcd)+" <-&-> "+"y : "+x.y*(c/ x.gcd));
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
