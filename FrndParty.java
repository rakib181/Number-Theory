import java.util.*;
public class FrndParty {
	public static long partyGo(int n) {
		if(n<=1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		return partyGo(n-1)+(n-1)*partyGo(n-2);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(partyGo(n));
	}
}
