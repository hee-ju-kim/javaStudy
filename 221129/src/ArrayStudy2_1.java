//3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 
// “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//(0, 0)(0, 1)(0, 2)
//(1, 0)(1, 1)(1, 2)
//(2, 0)(2, 1)(2, 2)
public class ArrayStudy2_1 {
	public static void  main (String[] args) {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
	}
}
