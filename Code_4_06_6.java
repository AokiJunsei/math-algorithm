import java.util.*;

class Code_4_06_6 {
	public static void main(String[] args) {
		
		fact = new long[LIMIT + 1];
		fact[0] = 1;
		for (int i = 1; i <= LIMIT; i++) {
			fact[i] = fact[i - 1] * i % MOD;
		}
		
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println(ncr(X + Y, Y));
	}
	static final long MOD = 1000000007;
	static final int LIMIT = 200000;
	static long[] fact;
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
	static long ncr(int n, int r) {
		
		return division(fact[n], fact[r] * fact[n - r] % MOD, MOD);
	}
}
