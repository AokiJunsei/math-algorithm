import java.util.*;

class Code_3_06_5 {
	static int N;
	static int[] A;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		
		int answer = solve(1, N + 1);
		System.out.println(answer);
	}
	static int solve(int l, int r) {
		if (r - l == 1) {
			return A[l];
		}
		int m = (l + r) / 2; // [l, r) の中央で分割
		int s1 = solve(l, m); // s1 は A[l] + ... + A[m-1] の合計値
		int s2 = solve(m, r); // s2 は A[m] + ... + A[r-1] の合計値
		return s1 + s2;
	}
}
