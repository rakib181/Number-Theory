import java.util.*;
public class FermatLittleTheorem {
	public static int binPow(int x,int y,int z) {
		int res=1;
		x%=z;
		while(y>0) {
			if((y&1)==1) {
				res=(res*x)%z;
			}
			x=(x*x)%z;
			y>>=1;
		}
		return res;
	}
	public static boolean isPrime(int n,int k) {
		if(n<=1 || n==4) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		while(k>0) {
			int a=2+(int)Math.random()%(n-4);
			if(binPow(a,n-1,n)!=1) {
				return false;
			}
			k--;
		}
		return true;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),k=5;
	if(isPrime(n,k)) {
	System.out.println("True");
	}else {
		System.out.println("False");
	}
	}
}
