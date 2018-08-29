// 
package junyeong.java.cal; //

import java.util.*;

public class CalDemo1 { // 사칙연산이 가능한 계산기 프로그램

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalDemo1 cal = new CalDemo1();
		double result = 0;
		
		System.out.print("숫자입력 : ");
		double val1 = Double.parseDouble(input.next());
		
		while(true) {
			System.out.print("연산자입력(종료하려면 q를 누르세요) : ");
			String operator = input.next();
			
			if(operator.equals("q")) {
				System.out.println();
				System.out.printf("결과 : %.2f ", result);
				return;
			}
			
			System.out.print("숫자입력 : ");
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
			case "/" : if(v2==0) {System.out.println("Division Error"); System.exit(0);} //여기도바꾸고..				
				return v1 / v2;
			default : System.out.println("연산자는 '+ - * /' 만을 입력하시오"); System.exit(0); return 0; // 여기를 바꿀 수 없는가,,
		}
		
	}
	
}