//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int a=Integer.parseInt(bf.readLine());
		
		if(a>10000) {
			System.out.println("五位数");
		}
		else if(a>1000) {
			System.out.println("四位数");
		}
		else if(a>100) {
			System.out.println("三位数");
		}
		else if(a>10) {
			System.out.println("两位数");
		}
		else if(a>1) {
			System.out.println("一位数");
		}
		String b=Integer.toString(a);
		for(int j=1;j<=b.length();j++) {
			System.out.print(b.charAt(b.length()-j));
		}
	}

}
