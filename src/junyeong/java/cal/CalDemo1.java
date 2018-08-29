// 
package junyeong.java.cal; //

import java.util.*;

public class CalDemo1 { // ��Ģ������ ������ ���� ���α׷�

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalDemo1 cal = new CalDemo1();
		double result = 0;
		
		System.out.print("�����Է� : ");
		double val1 = Double.parseDouble(input.next());
		
		while(true) {
			System.out.print("�������Է�(�����Ϸ��� q�� ��������) : ");
			String operator = input.next();
			
			if(operator.equals("q")) {
				System.out.println();
				System.out.printf("��� : %.2f ", result);
				return;
			}
			
			System.out.print("�����Է� : ");
			double val2 = Double.parseDouble(input.next());
			
			result = cal.calculate(val1, operator, val2);
					
			val1 = result;
		}
	}
	
	double calculate(double v1, String op, double v2) {
		switch(op) {
			case "+" : return v1 + v2; 
			case "-" : return v1 - v2;
			case "*" : return v1 * v2;
			case "/" : if(v2==0) {System.out.println("Division Error"); System.exit(0);} //���⵵�ٲٰ�..				
				return v1 / v2;
			default : System.out.println("�����ڴ� '+ - * /' ���� �Է��Ͻÿ�"); System.exit(0); return 0; // ���⸦ �ٲ� �� ���°�,,
		}
		
	}
	
}