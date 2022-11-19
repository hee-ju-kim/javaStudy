import java.util.Scanner;

// [4-10] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력 해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
// 사용자가 값을 입력하면, 컴퓨터는 자 신이 생각한 값과 비교해서 결과를 알려준다. 
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. 
public class Ex4_10 {
	public static void main(String args[]) {
		int cnt = 0;
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			cnt++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt(); 
			
			if(input == answer) {
				System.out.println("정답");
				System.out.println("cnt = " + cnt);
				break;
			} else if(input < answer) {
				System.out.println("정답보다 작음");
			} else {
				System.out.println("정답보다 큼");
			}
		} while(true); 
		
	}
}
