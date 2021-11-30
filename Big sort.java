package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bigsort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		System.out.println("请输入第一个数：");
		int x=Integer.parseInt(bf.readLine());
		System.out.println("请输入第二个数：");
		int y=Integer.parseInt(bf.readLine());
		System.out.println("请输入第三个数：");
		int z=Integer.parseInt(bf.readLine());
		
		if(x<y) {
			int temp=y;
			y=x;
			x=temp;
		}
		if(x<z) {
			int temp=z;
			z=x;
			x=temp;
		}
		if(y<z) {
			int temp=z;
			z=y;
			y=temp;
		}
		System.out.println(x+"\n"+y+"\n"+z+"\n");
	}

}
