import java.util.*;
public class SieveFactorization {
	static int MX=1000000;
	static int[] sieve=new int[MX+1];
	static void factorization(int n) {
		if(n==1) {
			System.out.print("2"+"^"+"0");
			return;
		}
		List<Integer>fact=new ArrayList<>();
		Arrays.fill(sieve, -1);
		for(int i=2;i*i<=MX;i++) {
			if(sieve[i]==-1) {
				sieve[i]=i;
				for(int j=2*i;j<=MX;j+=i) {
					sieve[j]=sieve[i];
				}
			}
		}
		while(n>1) {
			fact.add(sieve[n]);
			n/=sieve[n];
		}
		Map<Integer,Integer>mp=new TreeMap<>();
		for(int i=0;i<fact.size();i++) {
			if(!mp.containsKey(fact.get(i))) {
				mp.put(fact.get(i), 1);
			}else {
				mp.put(fact.get(i), mp.get(fact.get(i))+1);
			}
		}int cnt=1;
		for(int key:mp.keySet()) {
			System.out.print(key+"^"+mp.get(key));
			if(cnt<=mp.size()-1) {
				System.out.print("*");
			}
			cnt++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factorization(n);
	}
}
