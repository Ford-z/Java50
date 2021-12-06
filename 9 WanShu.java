//一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。
package TestTN;

public class wanshu {
	public static boolean isws(int a) {
		int temp=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				temp+=i;
			}
		}
		return temp==a;
	}
	
	public static void main(String [] args) {
		for(int i=1;i<1000;i++) {
			if(isws(i)) {
				System.out.println(i+"\n");
			}
		}
	}

}
