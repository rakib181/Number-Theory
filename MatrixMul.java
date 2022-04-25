import java.util.*;

public class MatrixMul {
	public static int[][] mul(int[][] arr , int[][] arr1,int n,int k){
		int[][] yo=new int[n+1][k+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				for(int p=0;p<n;p++) {
					yo[i][j]+=arr[i][p]*arr1[p][j];
				}
			}
		}
		return yo;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] arr=new int[n+1][m+1];
		System.out.println("Input 1: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Input 2: ");
		int r=sc.nextInt(),k=sc.nextInt();
		int[][] arr1=new int[r+1][k+1];
		for(int i=0;i<r;i++) {
			for(int j=0;j<k;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int[][] res=new int[n+1][k+1];
		 res=mul(arr,arr1,n,k);
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
