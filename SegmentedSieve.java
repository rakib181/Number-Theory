import java.util.*;
public class SegmentedSieve {
	static int n=100000;
	static boolean[] sieve=new boolean[n+1];
	public static void sieveCreate() {
		for(int i=2;i<=n;i++) {
			sieve[i]=true;
		}
		for(int i=2;i<=n;i++) {
			if(sieve[i]==true) {
				for(int j=2*i;j<=n;j+=i) {
					sieve[j]=false;
				}
			}
		}
		
	}
	public static List<Integer> generatePri(int n){
		List<Integer> ds=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(sieve[i]==true) {
				ds.add(i);
			}
		}
		return ds;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int l=sc.nextInt(),r=sc.nextInt();
			sieveCreate();
			ArrayList<Integer> primes=(ArrayList<Integer>) generatePri((int)Math.sqrt(r));
			boolean[] dummy=new boolean[r-l+1];
			for(int i=0;i<r-l+1;i++) {
				dummy[i]=true;
			}
			for(int pr:primes) {
				int firstmultiple=(l/pr)*pr;
				if(firstmultiple<l) {
					firstmultiple+=pr;
				}
				for(int j=Math.max(firstmultiple, pr*pr);j<=r;j+=pr) {
					dummy[j-l]=false;
				}
			}
			for(int i=l;i<=r;i++) {
				if(dummy[i-l]==true) {
				System.out.print(i+" ");
				}
			}
		}

	}

}
