import java.math.BigInteger;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     BigInteger bi=new BigInteger("1");
     for(int i=2;i<=n;i++) {
    	 bi=bi.multiply(BigInteger.valueOf(i));
    	
     }
     System.out.println(bi);
	}
}
