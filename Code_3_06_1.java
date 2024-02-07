import java.util.*;

class Code_3_06_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 1; i <= N; i++) {
			A[i - 1] = sc.nextInt();
		}
		
		
		Arrays.sort(A);
		
		
		for (int i = 1; i <= N; i++) {
			System.out.println(A[i - 1]);
		}
	}
}
