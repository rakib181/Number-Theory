import java.util.*;

public class CoseqBits {
	public static int cntBits(int n) {
	    if(n==0) {
	    	return 1;
	    }
		if(n==1) {
			return 2;
		}
		return cntBits(n-1)+cntBits(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(cntBits(n));

	}

}
