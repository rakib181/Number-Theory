import java.util.*;
public class BitWiseSieveAgain {
	static int MX=105;
	static int[] prime=new int[MX/32+5];
	static ArrayList<Integer> PrimGen=new ArrayList<>();
	static boolean check(int n,int pos) {
		if((n&(1<<pos))>=1) {
		return false;
		}else {
			return true;
		}
	}
	static int mark(int n,int pos) {
		n = n |(1<<pos);
		return n;
	}
	static void bitWiseSieve() {
		int sq=(int)Math.sqrt(MX);
		for(int i=3;i*i<=MX;i+=2) {
			if(check(prime[i/32],i%32)) {
				for(int j=i*i;j<=MX;j+=i) {
					prime[j/32]=mark(prime[j/32],j%32);
				}
			}
		}
		 PrimGen.add(2);
		 for(int i=3;i<=MX;i+=2) {
			 if(check(prime[i/32],i%32)) {
				 PrimGen.add(i);
			 }
		 }
	}
	public static void main(String[] args) {
		bitWiseSieve();
		for(int i=0;i<PrimGen.size();i++) {
			System.out.print(PrimGen.get(i)+" ");
		}
	}
}
