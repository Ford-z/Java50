//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
package TestTN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionOperator {
	public static void main(String[] args) {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		int N=0;
		try {
			N=Integer.parseInt(buffer.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.print("学习成绩为："+((N<60)?"C":(N>90)?"A":"B"));
	}

}
