package TestTN;

public class FindPrimeNumber {
	public static void main(String[] args) {
		boolean flag=true;
		int ans=0;
		for(int i=101;i<=200;i++) {
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
