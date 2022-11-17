// [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
public class Ex4_4 {
	public static void main(String args[]) {
		int total = 0;
		int s = 1;
		int num = 0;
		
		for(int i = 1; total < 100; i++, num++, s = -s) {
			total += (i * s);
		}

		System.out.println(total);
		System.out.println(num);
	}
}
