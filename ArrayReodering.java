import java.util.*;
public class ArrayReodering {
	static int GCD(int x,int y) {
		if(y==0) {
			return x;
		}
		return GCD(y,x%y);
	}
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),ans=0;
			int[] arr=new int[n];
			LinkedList<Integer>yo=new LinkedList<>();
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if((arr[i]&1)==0) {
					yo.addFirst(arr[i]);
				}else {
					yo.addLast(arr[i]);
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(GCD(yo.get(i),yo.get(j)*2)>1) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
