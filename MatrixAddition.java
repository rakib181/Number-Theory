import java.util.*;

public class MatrixAddition {
	static int[][] matrixAdd(int[][] a,int[][] b) {
		int n=a.length,m=b.length;
		int[][] arr=new int[n+1][m+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
			{
				arr[i][j]+=a[i][j]+b[i][j];
			}
		}
		return arr;
	}
	static int[][] matrixSub(int[][] a,int[][] b) {
		int n=a.length,m=b.length;
		int[][] arr=new int[n+1][m+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
			{
				arr[i][j]-=a[i][j]-b[i][j];
			}
		}
		return arr;
	}
	static int[][] matrixMul(int[][] a,int[][] b) {
		int n=a.length,m=b.length;
		int[][] arr=new int[n+1][m+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
			{
				for(int k=0;k<n;k++) {
				arr[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] a=new int[n+1][m+1];
		int[][] b=new int[n+1][m+1];
		System.out.println("Input First Matrix : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Input Second Matrix : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int[][] yo=matrixAdd(a,b);
		System.out.println("Print Addition : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(yo[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Print Subtraction : ");
		int[][] ty=matrixSub(a,b);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(ty[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Print Multiplication : ");
		int[][] my=matrixMul(a,b);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(my[i][j]+" ");
			}
			System.out.println();
		}
	}
}
