// [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
public class Ex4_3 {
	public static void main(String args[]) {
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 10 ; i++) {
			sum += i;
			sum2 += sum;
		}
		
		System.out.println(sum2);
		
	}
}
