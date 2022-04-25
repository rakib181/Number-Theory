import java.util.*;

public class ExtendedEuclidian {
	public static List<Integer> ExtndEucld(int a,int b){
		List<Integer>yo=new ArrayList<>();
		if(b==0) {
			yo.add(1);
			yo.add(0);
			yo.add(a);
			return yo;
		}
		List<Integer> result=ExtndEucld(b,a%b);
		System.out.println(result);
		int smallX=result.get(0);
		int smallY=result.get(1);
		int gcd=result.get(2);
		int x=smallY;
		int y=smallX-(a/b)*smallY;
		yo.add(x);
		yo.add(y);
		yo.add(gcd);
		return yo;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		List<Integer> resul=ExtndEucld(a,b);
		System.out.println(resul.get(0)+" "+resul.get(1)+" "+resul.get(2));
        
	}

}
