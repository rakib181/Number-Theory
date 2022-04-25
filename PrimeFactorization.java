import java.util.*;
public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				while(n%i==0) {
					n/=i;cnt++;
				}
				System.out.print(i+"^"+cnt+" ");
				cnt=0;
			}	
		}
		if(n>1) {
			System.out.print(n+"^"+"1");
		}
	}
}
