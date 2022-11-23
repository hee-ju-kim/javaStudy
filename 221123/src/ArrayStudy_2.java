import java.util.Scanner;

// arr 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
public class ArrayStudy_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("변경할 인덱스 : ");
		int index = scan.nextInt();
	
		arr[index] = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("index = %d, value = %d \n", i, arr[i]);
		}
	}
}
