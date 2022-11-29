// 4행 4열짜리 정수형 배열을 선언 및 할당하고
//1) 1 ~ 16까지 값을 차례대로 저장하세요.
//2) 저장된 값들을 차례대로 출력하세요.
public class ArrayStudy2_2 {
	public static void main(String[] arg) {
		int arr[][] = new int[4][4];
		int tmp = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				arr[i][j] = tmp;
				tmp++;
				
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
