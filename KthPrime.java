import java.util.*;
public class KthPrime {
static int Max_Size=1000007;
static List<Integer>pri=new ArrayList<>();
public static void seive() {
	boolean[] isPrime=new boolean[Max_Size+1];
	for(int i=2;i<=Max_Size;i++) {
		isPrime[i]=true;
	}
	for(int i=2;i*i<=Max_Size;i++) {
		if(isPrime[i]==true) {
			for(int j=2*i;j<=Max_Size;j+=i) {
				isPrime[j]=false;
			}
		}
	}
	for(int i=2;i<=Max_Size;i++) {
		if(isPrime[i]==true) {
			pri.add(i);
		}
	}
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int k=sc.nextInt();
          seive();
          System.out.println(pri.get(k-1));
	}
}
