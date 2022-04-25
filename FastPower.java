import java.util.*;

public class FastPower {
	public static long binPow(int x,int y) {
		if(y==0) {
			return 1;
		}
		long res=binPow(x,y/2);
		if((y&1)==1) {
			return x*res*res;
		}else {
			return res*res;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
        System.out.println(binPow(x,y));
	}
}
