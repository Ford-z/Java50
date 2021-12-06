//求一个3*3矩阵对角线元素之和
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testadd3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int [][]a=new int[3][3];
		int ans=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("请输入矩阵元素");
				a[i][j]=Integer.parseInt(bf.readLine());
				if (i==j) {
					ans+=a[i][j];
				}
			}
		}
		System.out.println(ans);
	}

}
