import java.util.*;

public class BitWiseSieveTry {
	static int MAX=105;
	static int[] prime=new int[MAX/32+1];
	static ArrayList<Integer> getPrime=new ArrayList<>();
	static boolean check(int k,int pos) {
		if((k&(1<<pos))>=1) {
			return false;
		}
		return true;
	}
	static int  set(int k,int pos) {
		return k|=(1<<pos);
	}
	static void bitwiseTry() {
		int sq=(int)Math.sqrt(MAX);
		for(int i=3;i<=sq;i+=2) {
			if(check(prime[i>>5],i&31)) {
				for(int j=2*i;j<=MAX;j+=i) {
					prime[j>>5]=set(prime[j>>5],j&31);
				}
			}
		}
		getPrime.add(2);
		for(int i=3;i<=MAX;i+=2) {
			if(check(prime[i>>5],i&31)) {
				getPrime.add(i);
			}
		}
	}

	public static void main(String[] args) {
	   bitwiseTry();
	   for(int i=0;i<getPrime.size();i++){
		   System.out.print(getPrime.get(i)+" ");
	   }
	}
}
