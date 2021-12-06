//两个字符串连接程序
package TestTN;

import java.util.Scanner;

public class TestString {
	public static String connect(String str1,String str2) {
		byte[] buf=new byte[str1.length()+str2.length()];
		str1.getBytes(0,str1.length(),buf,0);
		str2.getBytes(0,str2.length(),buf,str1.length());
		return new String(buf);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入字符串1：\n");
		String str1=s.next();
		System.out.println("请输入字符串2：\n");
		String str2=s.next();
		
		System.out.print("字符串："+connect(str1,str2));
	}
}
