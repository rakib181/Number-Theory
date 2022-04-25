import java.util.*;

public class ModularMultipicativeinverse {
     static long mod=1000000007;
     public static long binExpo(long x,long y,long mod) {
    	 long res=1;
    	 while(y>0) {
    	if((y&1)==1) {
    		res=(res*x)%mod;
    	}
    	x=(x*x)%mod;
    	y>>=1;
    	}
    	 return res;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
	   System.out.println(binExpo(a,mod-2,mod));
	}
}
