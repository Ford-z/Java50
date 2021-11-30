//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。

package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class huiwenshu {
	public static void main(String []args) {
		System.out.print("请输入一个五位整数:\n");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int a=0;
		try {
			a=Integer.parseInt(bf.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ans=Integer.toString(a);
		boolean flag=false;
		if (ans.charAt(0)==ans.charAt(4)&ans.charAt(1)==ans.charAt(3)) {
			flag=true;
		}
		System.out.print(flag);
	}

}
