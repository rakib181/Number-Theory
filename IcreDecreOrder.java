import java.util.*;
public class IcreDecreOrder {
	public static int increOrder(int n){
		if(n==0) {
			return 1;
		}
		System.out.print(n+" ");
		return increOrder(n-1);	
	}
	public static int decreOrder(int n) {	
		if(n==0) {
			return 1;
		}
		 decreOrder(n-1);
		System.out.print(n+" ");
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        increOrder(n);
        System.out.println();
        decreOrder(n);
	}
}