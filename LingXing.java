//打印出如下图案（菱形） 
package TestTN;

public class LingXing {
	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			int a=1+(i-1)*2;
			int b=4-i;
			for (;b>0;b--) {
				System.out.print(" ");
			}
			for (;a>0;a--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=3;i>=1;i--) {
			int a=1+(i-1)*2;
			int b=4-i;
			for (;b>0;b--) {
				System.out.print(" ");
			}
			for (;a>0;a--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
