//求100之内的素数
package TestTN;

public class Sushu {
	public static void main(String[] args) {
		boolean flag=true;
		int ans=1;
		System.out.print(2+"\n");
		for(int i=3;i<=100;i++) {
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				ans+=1;
				System.out.print(i+"\n");
			}
			flag=true;
		}
		System.out.print("一共有"+ans+"个");
	}
}
