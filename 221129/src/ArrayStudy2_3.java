//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하세요.
//	0	  1	  2	   3
// 	값 	  값	  값	   0~3행합
//	값 	  값	  값	   0~3행합
//	값 	  값	  값	   0~3행합
// 0열합 1열합 2열합	총합
public class ArrayStudy2_3 {
	public static void main(String[] arg) {
		int[][] arr = new int[4][4];
		int rowEnd = arr.length - 1;
		int colEnd = arr[0].length - 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				if(i != rowEnd && j != colEnd) {
					int temp = (int)(Math.random() * 10 + 1);
					
					arr[i][j] = temp;
					arr[i][rowEnd] += arr[i][j];
					arr[colEnd][j]  += arr[i][j];
					arr[rowEnd][colEnd] += arr[i][j];
				}
				System.out.printf("%d \t", arr[i][j] );
			}
			System.out.println();
		}
		
	}
}
