// arr 배열의 요소에서 최대값과 최소값을 구해보자.
public class ArrayStudy_4 {
	public static void main(String args[]) {
		 int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		 int max = 0;
		 int min = 0;
		 
		 for(int i = 1; i < arr.length; i++) {
			 if(arr[i] > arr[i-1]) {
				 max = arr[i];
			 }
			 
			 if(arr[i] < arr[i-1]) {
				 min = arr[i];
			 }
		 }
		 
		 System.out.printf("max = %d, min = %d", max, min);
	}
}
