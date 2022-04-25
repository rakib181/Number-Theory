import java.util.*;

public class FiboDP {
	public static int[] fibo(int n) {
		int[] yo=new int[n+1];
		yo[0]=0;
		yo[1]=1;
		for(int i=2;i<=n;i++) {
			yo[i]=yo[i-1]+yo[i-2];
		}
		return yo;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] k=fibo(n);
		System.out.println(k[k.length-1]);
	}
}
