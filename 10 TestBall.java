//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
package TestTN;

public class TestBall {
	public static void main(String[] args) {
		double h=100;
		double ans=0;
		for(int i=1;i<=10;i++) {
			ans+=h+h/2;
			h/=2;
		}
		System.out.print(h+"\n");
		System.out.print(ans);
	}

}
