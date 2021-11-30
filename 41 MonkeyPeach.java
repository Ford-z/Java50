//海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
package TestTN;

public class MonkeyPeach {
	public static void main(String [] args) {
		for (int n=1;n<10000;n++) {
			int ans=n;
			boolean flag=true;
			for(int i=0;i<5;i++) {
				if(ans%5==1) {
					ans=ans-1;
					ans=ans-ans/5;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(n+"\n");
				}
		}
	}

}
