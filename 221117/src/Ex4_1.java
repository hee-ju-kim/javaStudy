//[4-1] 다음의 문장들을 조건식으로 표현하라.
//1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
//4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
//나눠떨어지지 않을 때 true인 조건식
//7. boolean형 변수 powerOn이 false일 때 true인 조건식 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
public class Ex4_1 {
	public static void main(String args[]) {
		int x = 15;
		Boolean ex1 = x > 10 && x < 20;
		
		char ch = 'X';
		Boolean ex2 = ch != ' ' && ch != '\t'; 
		Boolean ex3 = ch == 'x' || ch == 'X';
		Boolean ex4 = ch <= '0' && ch >= '9';
		Boolean ex5 =  ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
		
		int year = 2000;
		Boolean ex6 = year % 400 == 0 || year % 4 == 0 && year % 100 != 0; 
		
		Boolean powerOn = false;
		Boolean ex7 = !powerOn;
		
		String str = "yes";
		Boolean ex8 = str.equals("yes");	
		
	}
}
