import java.util.*;
public class SegmentedSieveAgain {
	static int n=100000;
	static boolean[] pri=new boolean[n+1];
	public static void sieve() {
		for(int i=2;i<=n;i++) {
			pri[i]=true;
		}
		for(int i=2;i<=n;i++) {
			if(pri[i]==true) {
				for(int j=2*i;j<=n;j+=i) {
					pri[j]=false;
				}
			}
		}
	}
	public static List<Integer> generatePri(int n){
		List<Integer> ds=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(pri[i]==true) {
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
			sieve();
			List<Integer> primes=generatePri((int)Math.sqrt(r));
			boolean[] dum=new boolean[r-l+1];
			Arrays.fill(dum, true);
			/*
			 * for(int i=0;i<r-l+1;i++) { dum[i]=true; }
			 */
			for(int x:primes) {
				int firstMul=(l/x)*x;
				if(firstMul<l) {
					firstMul+=x;
				}
				for(int i=Math.max(firstMul, x*x);i<=r;i+=x) {
					dum[i-l]=false;
				}
			}
			for(int i=l;i<=r;i++) {
				if(dum[i-l]==true) {
				System.out.print(i+" ");
			}
			}	
		}
	}
}
