//打印出杨辉三角形（要求打印出10行如下图）
package TestTN;

public class Yanghui {
	public static void main(String[] args) {
		int [][]a=new int[11][11];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;a[i][j]>0&&j<10;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
