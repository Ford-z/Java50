/*809*??=800*??+9*??+1*/
package TestTN;

public class Test4 {
	public static void main(String[] args) {
		for(int i=10;i<100&&8*i<100&&9*i<1000;i++) {
			if(809*i==(800*i+9*i)) {
				System.out.println(i+"\n");
				System.out.println(i*809+"\n");
				return;
			}
		}
		System.out.println("None\n");
	}

}
