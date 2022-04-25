import java.util.*;
public class BinaryPower {
	static int mod=1000000007;
      public static long BinPower(int x,int y) {
    	  long res=1;
    	  while(y>0) {
    		  if((y&1)==1) {
    			 res*=x;res%=mod;
    		  }
    		  x*=x;x%=mod;
    		  y>>=1;
    	  }
    	  return res;
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		System.out.println(BinPower(x,y));
	}
}
