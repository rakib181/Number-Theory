import java.util.*;

public class Pow {
	public static long powRec(int x,int y) {
		if(y==0) {
			return 1;
		}
		return x*powRec(x,y-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
     System.out.println(powRec(x,y));
	}

}
