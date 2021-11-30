//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
package TestTN;

public class FindDaffodilNumber {
	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
			int a=i/100;
			int b=(i-100*a)/10;
			int c=(i-100*a-10*b);
			if(i==a*a*a+b*b*b+c*c*c) {
				System.out.print(i+"\n");
			}
		}
	}

}
