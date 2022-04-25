import java.util.*;

public class PrimalityTest {
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	  }
	}

}
