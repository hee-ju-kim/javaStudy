import java.util.Scanner;

// 인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보자.
public class ArrayStudy_3 {
	public static void main(String[] args) {
		 int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("변경할 인덱스1 : ");
		 int index1 = scan.nextInt();
		 System.out.print("변경할 인덱스2 : ");
		 int index2 = scan.nextInt();
		 
		 int tmp = arr[index1];
		 arr[index1] = arr[index2];
		 arr[index2] = tmp;
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.printf("index = %d, value = %d \n", i, arr[i]);
		 }
	}
}
