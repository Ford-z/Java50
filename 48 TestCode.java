//某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCode {
	public static void main(String []args) throws NumberFormatException, IOException {
		System.out.print("请输入一个四位正整数\n");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int is=Integer.parseInt(bf.readLine());
		
		int a=is/1000;
		int b=(is-a*1000)/100;
		int c=(is-a*1000-b*100)/10;
		int d=is-a*1000-b*100-c*10;
		
		a=(a+5)%10;
		b=(b+5)%10;
		c=(c+5)%10;
		d=(d+5)%10;
		
		System.out.println(d*1000+c*100+b*10+a);
	}

}
