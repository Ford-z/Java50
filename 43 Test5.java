//求0—7所能组成的奇数个数。
package TestTN;

public class Test5 {
	public static void main(String [] args) {
		int temp=7*4;
		int ans=temp+4;
		for(int i=2;i<8;i++) {
			temp=8*temp;
			ans+=temp;
		}
		System.out.println(ans);
	}

}
