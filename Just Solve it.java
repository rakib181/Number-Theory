import java.io.*;
import java.util.*;

public class JustSolveIt {
    static Pair lpsgcf(int x){
        int[] GCF=new int[x+1];
        int[] div=new int[x+1];
        int[] sumDiv=new int[x+1];
        for (int i=1;i<=x;i++){
            GCF[i]=i;
            div[i]=1;
            sumDiv[i]=1;
        }
        for(int i=2;i<=x;i++){
            for(int j=i;j<=x;j+=i){
                    GCF[j] = Math.min(GCF[j], i);
                    ++div[j];
                    sumDiv[j]+=i;
            }
        }
        Vector<Integer>vec=new Vector<>();
        Set<Integer> set=new HashSet<>();
        int n=x;
        while (n>1){
            vec.add(GCF[n]);
            set.add(GCF[n]);
            n/=GCF[n];
        }
        Collections.sort(vec);
        Pair ans=new Pair(0,0,0,0,0,0);
        ans.lcf=vec.get(0);
        ans.gcf=vec.get(vec.size()-1);
        ans.dis=set.size();
        ans.tdiv= vec.size();
        ans.divcnt=div[x];
        ans.dixSum=sumDiv[x];
         return ans;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        while (n-->0){
            int x=sc.nextInt();
            Pair ans=lpsgcf(x);
            out.println(ans.lcf+" "+ans.gcf+" "+ans.dis+" "+ans.tdiv+" "+ans.divcnt+" "+ans.dixSum);
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
    static class Pair{
        int lcf,gcf,dis,tdiv,divcnt,dixSum;
        public Pair(int _l ,int _g,int _dis,int _tdix,int _divcnt,int _dixSum) {
            this.lcf=_l;
            this.gcf=_g;
            this.dis=_dis;
            this.tdiv=_tdix;
            this.divcnt=_divcnt;
            this.dixSum=_dixSum;
        }
    }
}
