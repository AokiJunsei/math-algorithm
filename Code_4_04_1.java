import java.util.*;

class Code_4_04_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] prime = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			prime[i] = true;
		}
		
		
		for (int i = 2; i * i <= N; i++) {
			if (prime[i] == true) {
				for (int x = 2 * i; x <= N; x += i) {
					prime[x] = false;
				}
			}
		}
		
		
		for (int i = 2; i <= N; i++) {
			if (prime[i] == true) {
				System.out.println(i);
			}
		}
	}
}
