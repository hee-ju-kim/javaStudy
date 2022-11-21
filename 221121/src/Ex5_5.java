import java.util.Arrays;

// [5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프 로그램이다. 
// (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
public class Ex5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9}; 
		int[] ball3 = new int[3];
		int[] ball4 = new int[3];
		int[] ball5 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다. 
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length); 
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		// Arrays.copyOf(배열 , 데이터 갯수 ) 배열의 시작점 ~ 원하는 길이까지 배열 복사 
		ball3 = Arrays.copyOf(ballArr, 3); 
		// Arrays.copyOfRange(array, 시작점 , 데이터 갯수 ) 배열 시작점 지정 ~ 원하는 길이만큼 배열복사 
		ball4 = Arrays.copyOfRange(ballArr, 0, 3); 
		// System.arraycopy(기준이되 배열 , 시작점 , 복사할 배열 , 시작점 , 데이터 갯수 )
		System.arraycopy(ballArr, 0, ball5, 0, 3); 
		
		for(int i=0;i<ball3.length;i++) { 
			System.out.print(ball3[i]);
		}
		System.out.println();
		
		for(int i=0;i<ball4.length;i++) { 
			System.out.print(ball4[i]);
		}
		System.out.println();
		
		for(int i=0;i<ball5.length;i++) { 
			System.out.print(ball5[i]);
		}
		System.out.println();
	}
}
