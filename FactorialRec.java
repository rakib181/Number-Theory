import java.util.*;
public class FactorialRec {
	static int mod=1000000007;
	static long fact(long n) {
		if(n<=1) {
			return 1;
		}
		return (n*fact(n-1))%mod;
	}
	static long fibo(long n) {
		if(n<=2) {
			return 1;
		}
		return (fibo(n-1)+fibo(n-2))%mod;
	}
	static long sumDigits(long n) {
		if(n<1) {
			return 0;
		}
		return n%10+sumDigits(n/10);
	}
	static long pow(long x,long n) {
		if(n==0) {
			return 1;
		}
		return 2*pow(2, n-1);
	}
	static long binExpo(long x,long y) {
		if(y==0) {
			return 1;
		}
		long res=binExpo(x,y/2);
		if((y&1)==1) {
			return x*res*res;
		}else {
		return res*res;
		}
	}
	static long GCD(long x,long y) {
		if(y==0) {
			return x;
		}	
		return GCD(y,x%y);
	}
	static long decTobin(long x) {
		if(x<=0) {
		
			return 0;
		}
		return x%2+10*decTobin(x/2);
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	System.out.println(decTobin(n));
	}
}
