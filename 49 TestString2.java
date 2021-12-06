//计算字符串中子串出现的次数
package TestTN;

import java.util.Scanner;

public class TestString2 {
	public static int find(String str1,String str2) {
		int count=0;
		for(int i=0,j=0;i<str1.length();i++) {
			for(j=0;j<str2.length();j++) {
				if(str1.charAt(i+j)!=str2.charAt(j)) {
					break;
				}
			}
			if(j==str2.length()) {
				count++;
				i=i+j-1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入字符串：\n");
		String str1=s.next();
		System.out.println("请输入子串：\n");
		String str2=s.next();
		
		System.out.print("查找到的个数："+find(str1,str2));
	}

}
