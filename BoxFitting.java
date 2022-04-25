import java.util.*;

public class BoxFitting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),w=sc.nextInt(),sum=0,ans=1;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			ans=(int) Math.ceil((double)sum/w);
			System.out.println(ans);
		}
	}
}
