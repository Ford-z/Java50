//利用递归方法求5!。
package TestTN;

public class TestJiecheng2 {
	public static long jiecheng(int a) {
		if(a==1) {
			return a;
		}
		else {
			return jiecheng(a-1)*a;
		}
	}
	public static void main(String [] args) {
		System.out.println(jiecheng(5));
	}

}
