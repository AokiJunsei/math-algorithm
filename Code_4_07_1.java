import java.util.*;

class Code_4_07_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[][] A = new long[2][2];
		A[0][0] = 1; A[0][1] = 1;
		A[1][0] = 1; A[1][1] = 0;
		long[][] B = copyMatrix(power(A, N - 1));
		
		
		long answer = (B[1][0] + B[1][1]) % MOD;
		System.out.println(answer);
	}
	static final int MOD = 1000000000;
	static long[][] copyMatrix(long[][] A) {
		
		long[][] M = new long[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				M[i][j] = A[i][j];
			}
		}
		return M;
	}
	static long[][] multiplication(long[][] A, long[][] B) {
		
		long[][] C = new long[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					C[i][j] += A[i][k] * B[k][j];
					C[i][j] %= MOD;
				}
			}
		}
		return C;
	}
	static long[][] power(long[][] A, long n) {
		
		long[][] P = copyMatrix(A);
		long[][] Q = { { 0, 0 }, { 0, 0 } };
		boolean flag = false;
		for (int i = 0; i < 60; i++) {
			if ((n & (1L << i)) != 0L) {
				if (flag == false) {
					Q = copyMatrix(P);
					flag = true;
				}
				else {
					Q = copyMatrix(multiplication(Q, P));
				}
			}
			P = copyMatrix(multiplication(P, P));
		}
		return Q;
	}
}
