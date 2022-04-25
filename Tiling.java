import java.util.Scanner;

public class Tiling {
	public static int yo(int n) {
		if(n<=3) {
			return 1;
		}
		int ans=yo(n-1)+yo(n-4);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(yo(n));

	}

}
