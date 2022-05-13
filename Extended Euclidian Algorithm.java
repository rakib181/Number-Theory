import java.io.*;
import java.util.StringTokenizer;

public class ExtendedEuclidianAlgorithm {
    static triplet extEuclid(int a,int b){
        if(b==0){
            triplet ans=new triplet(0,0,0);
            ans.x=1;
            ans.y=0;
            ans.gcd=a;
            return ans;
        }
        triplet smallAns=extEuclid(b,a%b);
        triplet ans=new triplet(0,0,0);
        ans.gcd= smallAns.gcd;
        ans.x= smallAns.y;
        ans.y=smallAns.x-(a/b)* smallAns.y;
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        triplet t=new triplet(0,0,0);
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int a=sc.nextInt(),b=sc.nextInt();
        triplet ans= extEuclid(a,b);
       out.println(ans.x+" "+ans.y+" "+ans.gcd);
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
                    st = new StringTokenizer(br.readLine());
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
    public static class triplet{
        int x,y,gcd;
        triplet(int x,int y,int gcd){
            this.x=x;
            this.y=y;
            this.gcd=gcd;
        }
    }
}
