import java.util.*;
public class PrimeFactSieve {
	static int Max_Size=10000;
	public static void sieve(int x) {
		int[] arr=new int[Max_Size+1];
		Arrays.fill(arr, -1);
		for(int i=2;i<=Max_Size;i++) {
			if(arr[i]==-1) {
				arr[i]=i;
				for(int j=2*i;j<=Max_Size;j+=i) {
					arr[j]=arr[i];
				}
			}
		}
		List<Integer>fact=new ArrayList<>();
		while(x>1) {
			fact.add(arr[x]);
			x/=arr[x];
		}
		int cnt=0;
		Collections.sort(fact);
		for(int c:fact) {
			cnt++;
			System.out.print(c);
			if(cnt<fact.size()) {
			System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sieve(x);
	}
}
