import java.util.Scanner;

// hello를 입력받아 이를 olleh로 출력해보자.
public class ArrayStudy_5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		String word = scan.nextLine();
		
		char[] arr = new char[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(arr.length - i - 1);
		}
		
		System.out.println(new String(arr));
	}
}
