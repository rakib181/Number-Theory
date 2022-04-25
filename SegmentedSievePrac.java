import java.util.*;
public class SegmentedSievePrac {
	static int MX=100005;
	static boolean[] sieve=new boolean[MX+1];
	static void sieveEra() {
		Arrays.fill(sieve, true);
		sieve[0]=false;sieve[1]=false;
		for(int i=2;i<=MX;i++) {
			if(sieve[i]==true) {
				for(int j=2*i;j<=MX;j+=i) {
					sieve[j]=false;
				}
			}
		}
	}
	static List<Integer> priGen(int n){
		List<Integer> gen=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(sieve[i]==true) {
				gen.add(i);
			}
		}
		return gen;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt(),r=sc.nextInt();
       sieveEra();
       List<Integer> prime=priGen((int)Math.sqrt(r));
       boolean[] dummy=new boolean[r-l+1];
       Arrays.fill(dummy, true);
       for(int x:prime) {
    	   int firstMul=(l/x)*x;
    	   if(firstMul<l) {
    		   firstMul+=x;
    	   }
    	   for(int i=Math.max(firstMul, x*x);i<=r;i+=x) {
    		   dummy[i-l]=false;
    	   }
       }
       for(int i=l;i<=r;i++) {
    	   if(dummy[i-l]==true) {
    		   System.out.print(i+" ");
    	   }
       }
       System.out.println();
	}
}
