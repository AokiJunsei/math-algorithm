import java.util.*;

class Code_4_06_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		
		final long MOD = 1000000007;
		long bunshi = 1, bunbo = 1;
		for (int i = 1; i <= X + Y; i++) {
			bunshi = (bunshi * i) % MOD;
		}
		for (int i = 1; i <= X; i++) {
			bunbo = (bunbo * i) % MOD;
		}
		for (int i = 1; i <= Y; i++) {
			bunbo = (bunbo * i) % MOD;
		}
		
		
		long answer = division(bunshi, bunbo, MOD);
		System.out.println(answer);
	}
	static long modpow(long a, long b, long m) {
		
		long p = a, answer = 1;
		for (int i = 0; i < 30; i++) {
			if ((b & (1 << i)) != 0) {
				answer = (answer * p) % m;
			}
			p = (p * p) % m;
		}
		return answer;
	}
	static long division(long a, long b, long m) {
		
		return (a * modpow(b, m - 2, m)) % m;
	}
}
