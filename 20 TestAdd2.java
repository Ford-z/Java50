/**有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 **/
package TestTN;

public class TestAdd2 {
	public static void main(String[] args) {
		double a=2;
		double b=1;
		double ans=0.0;
		double temp=0;
		for(int i=1;i<=20;i++) {
			ans=ans+a/b;
			temp=a;
			a=a+b;
			b=temp;
		}
		System.out.print(ans);
	}

}
