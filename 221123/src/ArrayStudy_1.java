// arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자
// arr 배열 안의 모든 값을 더하고, 총합과 평균을 출력해보자.
// arr 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
public class ArrayStudy_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 60) {
				System.out.println(i);
			}
		}
		
		int sum = 0;
		float aver = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		aver = sum / (float)arr.length;
		
		System.out.printf("sum = %d, aver = %f \n", sum, aver);
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 3) {
				continue;
			}
			System.out.printf("index = %d, value = %d \n", i, arr[i]);
		}
	}
}
