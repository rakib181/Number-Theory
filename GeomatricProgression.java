import java.util.*;

public class GeomatricProgression {
	static int mod=1000000007;

	/*
	 * static int pow(int a,int b) { if(b==0) { return 1; } int res=pow(a,b/2);
	 * if((b&1)==1) { return res=res*res*a; }else { return res*res; } }
	 */
	static int powTry(int a,int b) {
		int res=1;
		if(b==0) {
			return 1;
		}
		while(b>0) {
			if((b&1)==1) {
				res*=a;
				res%=mod;
			}
			a*=a;
			a%=mod;
			b/=2;
		}
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] GP=new int[n];
	for(int i=0;i<n;i++) {
		GP[i]=3*powTry(2,i);
	}
	for(int i=0;i<n;i++) {
		System.out.print(GP[i]+" ");
	}
	System.out.println();
	}
}
