import java.util.*;
public class NthFiboMExpo {
	static int mod=1000000007;
	static int fibo(long n) {
		int[][] F=new int[][] {{1,1},{1,0}};
		if(n==0) {
			return 0;
		}else {
		 pow(F,n-1);
		}
		return F[0][0]%mod;
	}
	static void pow(int[][] F,long n) {
		if(n==0 || n==1) {
			return;
		}
		int[][] M=new int[][] {{1,1},{1,0}};
		pow(F,n/2);
		multiply(F,F);
		if((n&1)==1) {
			multiply(F,M);
		}
	}
	static void multiply(int[][] F,int[][] M) {
		int x=F[0][0]*M[0][0]+F[0][1]*M[1][0];
		int y=F[0][0]*M[0][1]+F[0][1]*M[1][1];
		int w=F[1][0]*M[0][0]+F[1][1]*M[1][0];
		int z=F[1][0]*M[0][1]+F[1][1]*M[1][1];
		F[0][0]=x;
		F[0][1]=y;
		F[1][0]=w;
		F[1][1]=z;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(fibo(n));
	}
}
