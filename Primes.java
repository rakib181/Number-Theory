/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class Primes {
	public static void fuckYou(int n) {
		int[] yo=new int[n+1];
		Arrays.fill(yo, -1);
		for(int i=2;i<=n;i++) {
			if(yo[i]==-1) {
				for(int j=i;j<=n;j+=i) {
					yo[j]=i;
				}
			}
		}
		List<Integer> keTui=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			keTui.add(yo[i]);
		}
 
    		   if(keTui.contains(n-2)) {
    			   System.out.print("2"+" "+(n-2));
    			   return;
       }else {
       System.out.println("-1");
       }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fuckYou(n);
        
	}

}
