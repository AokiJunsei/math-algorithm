import java.util.*;

class Code_3_06_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = func(N);
		System.out.println(answer);
	}
	static int func(int N) {
		
		return func(N - 1) * N;
	}
}
