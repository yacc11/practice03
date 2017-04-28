package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력 객체

		while( true ) { // 일단 시작함 
			/*  코드를 완성 합니다 */
			String info = scanner.nextLine(); //info 문자열에 입력 받음
			if(info.equals("quit")){ //quit 문자열이 들어오면 중지.
				break;
			}
			String[] tokens = info.split(" "); //띄어쓰기를 기준으로 피연산자 및 연산자 나눠줌
			
			int num1=Integer.parseInt(tokens[0]); //첫번째 피 연산자를 num1에 넣어줌
			int num2=Integer.parseInt(tokens[2]); //두번째 피 연산자를 num2에 넣어줌
	
			if(tokens[1].equals("+")){ //덧셈 객체 생성하여 진행
				Add add1 = new Add(num1,num2);
				add1.setValue(num1,num2);
			}
			else if(tokens[1].equals("-")){ //뺄셈 객체 생성하여 진행
				Sub sub1 = new Sub(num1,num2);
				sub1.setValue(num1, num2);
			}
			else if(tokens[1].equals("*")){ // 곱셈 객체 생성하여 진행
				Mul mul1 = new Mul(num1,num2);
				mul1.setValue(num1, num2);
			}
			else if(tokens[1].equals("/")){ //나눗셈 객체 생성하여 진행.
				Div div1 = new Div(num1,num2);
				div1.setValue(num1, num2);
			}
			
		}
		//>>3+5 enter
		//8
		//"8 space * space 6"
		//.split(" ");
		//String[] token = "8" , "*" , "6";
		//lvalue =8 rvalue = 6 parseInt 사용 if(token[1].equals('+'));
		//Add add = new Add();
		//add.set(lvalue, rvalue);
		//result = add.calc;
		//else if ( "-")
		//else { 알수없는 연산자}
		//입력값이 exit 스플릿 하기전 break;
		scanner.close();
	}
}
