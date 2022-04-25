import java.util.*;

public class FastMul {
	static int mod=1000000007;
     public static long yo(long a,long b) {
    	 long res=1;
    	 res=(a*b)%mod;
    	 return res%mod;
     }
     public static long binMulti(long x,long y,int mod) {
    	 int res=0;
    	 while(y>0) {
    		 if((y&1)==1) {
    			 res+=x;res%=mod;
    		 }
    		 x*=2;x%=mod;
    		 y>>=1;	 
    	 }
    	 return res;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong();
		//System.out.println(yo(a,b));
		System.out.println(binMulti(a,b,mod));
	}
}
