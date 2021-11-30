//有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3Quit {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("请输入人数：\n");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int n=Integer.parseInt(bf.readLine());
		
		int a[]=new int[1000];
		int i,temp;
		
		int count=0;
		temp=n;
		for(i=0;i<n;i++) {
			a[i]=i+1;
		}
		i=0;
		
		while(n>1) {
			if(a[i]!=0) {
				count++;
			}
			if(count==3) {
				a[i]=0;
				count=0;
				n--;
			}
			i++;
			if(i==temp) {
				i=0;
			}
		}
		for(i=0;i<temp;i++) {
			if(a[i]!=0) {
				System.out.print("剩下的为:"+a[i]);
			}
		}
	}

}
