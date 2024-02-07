import java.util.*;

class Code_2_01_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String answer = "";
		while (N >= 1) {
			
			
			if (N % 2 == 0) {
				answer = "0" + answer;
			}
			if (N % 2 == 1) {
				answer = "1" + answer;
			}
			N = N / 2;
		}
		System.out.println(answer);
	}
};
