import java.util.*;

public class PermutaionCombination {
	public static void modInv(int n,int m) {
		int gcd=GCD(n,m);
		if(gcd!=1) {
		System.out.println("Unavailable");
		}else {
			System.out.println(power(n,m-2,m));
		}
	}
	public static int GCD(int n,int m) {
		if(n==0) {
			return m;
		}
		return GCD(m%n,n);
	}
	public static int power(int n,int x,int m) {
		if(x==0) {
			return 1;
		}
		int p=power(n,x/2,m)%m;
		p=(int) ((p*(long)p)%m);
		if(x%2==0) {
			return p;
		}else {
			return (int) ((x*(long)p)%m);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        modInv(n,m);
	}
}
