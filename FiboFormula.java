import java.util.*;

public class FiboFormula {
	public static int formula(int n) {
		double phi=(1+Math.sqrt(5))/2;
		return (int)Math.round(Math.pow(phi, n)/Math.sqrt(5));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(formula(n));
	}
}
