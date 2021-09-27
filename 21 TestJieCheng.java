//求1+2!+3!+...+20!的和 
package TestTN;

public class Testjiecheng {
	public static void main(String[] args) {
		int ans=0;
		int temp=1;
		for (int i=1;i<=20;i++) {
			for(int j=1;j<=i;j++) {
				temp=temp*j;
			}
			ans=ans+temp;
			temp=1;
		}
		System.out.print(ans);
	}

}
