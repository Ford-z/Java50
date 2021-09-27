/**企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？ *//
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyAward {
	public static double sumAward(double i) {
		if(i<=10) {
			i*=0.1;
		}
		else if(i<=20) {
			i=(i-10)*0.075+10*0.1;
		}
		else if(i<=40) {
			i=(i-20)*0.05;
		}
		else if(i<=60) {
			i=(i-40)*0.03;
		}
		else if(i<=100) {
			i=(i-60)*0.015;
		}
		else {
			i=(i-100)*0.001;
		}
		return i;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is =new InputStreamReader(System.in);//读取屏幕输入输出
		BufferedReader br= new BufferedReader(is);
		double I=Integer.parseInt(br.readLine());
		System.out.print("当月奖金为"+sumAward(I)+"万元");
	}
}
