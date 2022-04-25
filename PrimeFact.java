import java.util.*;
public class PrimeFact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i*i<=n;i++) {
    	  if(n%i==0) {
    		  int cnt=0;
    		 while(n%i==0) {
    			 cnt++;
    			 n/=i;
    		 }
    		 System.out.print(i+"^"+cnt+" ");
    	  }
      }
      if(n>1) {
    	  System.out.print(n+"^"+1);;
      }
	}

}
