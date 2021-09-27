/**题目：输入某年某月某日，判断这一天是这一年的第几天？ **/
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDay {
	public static int Days(int y,int m,int d) {
		int ans=0;
		int [] Month= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((y%4==0 && y%100!=0)||y%400==0) {
			Month[1]=29;
		}
		for(int i=0;i<m-1;i++) {
			ans=ans+Month[i];
		}
		return ans+d;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is =new InputStreamReader(System.in);//读取屏幕输入输出
		BufferedReader br= new BufferedReader(is);
		String I=null;
		try {
			System.out.print("请输入年月日,例如: 2014-01-01\n");
			I=br.readLine();
		}catch(Exception e) {
			System.out.print("格式错误");
		}
		int y=Integer.parseInt(I.substring(0,I.indexOf('-')));
		int m=Integer.parseInt(I.substring(I.indexOf('-')+1,I.lastIndexOf('-')));
		int d=Integer.parseInt(I.substring(I.lastIndexOf('-')+1));
		System.out.print(Days(y,m,d));
	}
}
