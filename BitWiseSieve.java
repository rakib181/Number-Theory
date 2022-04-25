import java.util.*;

public class BitWiseSieve {
	static int isNotPrime(int [] prime,int k) {
		return (prime[k/64] & (1<<((k>>1)& 31)));
	}
	static void makeComposite(int[] prime,int k) {
		prime[k/64] |=(1<<((k>>1)&31));
	}
	static void bitwiseSieve(int n) {
		int[] prime=new int[n/64+1];
		for(int i=3;i*i<=n;i+=2) {
			if(isNotPrime(prime,i)==0) {
				for(int j=i*i,k=i<<1;j<n;j+=k) {
					makeComposite(prime,j);
				}
			}
		}
		System.out.print("2"+" ");
		for(int i=3;i<=n;i+=2) {
			if(isNotPrime(prime,i)==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		bitwiseSieve(n);
	}
}
