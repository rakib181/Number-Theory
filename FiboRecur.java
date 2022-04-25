import java.util.*;
public class FiboRecur {
	static int mod=1000000007;
	public static long fibo(long n) {
		if(n<=1) {
			return n;
		}else {
			return (fibo(n-1)+fibo(n-2))%mod;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		long n=sc.nextLong();
        System.out.println(fibo(n));
	}
}
