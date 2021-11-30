//编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String []args) throws NumberFormatException, IOException {
		System.out.print("请输入一个正整数\n");
		InputStreamReader in= new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		double a=Integer.parseInt(bf.readLine());
		double ans=1/a;
		if(a%2==0.0) {
			for(double i=2;i<a;i+=2) {
				ans+=1/i;
			}
		}
		else if(a%2==1.0){
			for(double i=1;i<a;i+=2) {
				ans+=1/i;
			}
		}
		System.out.println(ans);
	}

}
