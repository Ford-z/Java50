//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAdd {
	public static void main(String []args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader (System.in);
		BufferedReader bf=new BufferedReader(in);
		int n=Integer.parseInt(bf.readLine());
		
		int ans=0;
		for(int i=1;i<=n;i++) {
			int temp=0;
			for(int j=i-1;j>=0;j--) {
				temp+=2*Math.pow(10, j);
			}
			ans+=temp;
		}
		System.out.print(ans);
	}

}
