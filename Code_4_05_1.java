import java.util.*;

class Code_4_05_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M + 1];
		int[] B = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		
		ArrayList<Integer>[] G = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			G[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= M; i++) {
			G[A[i]].add(B[i]);
			G[B[i]].add(A[i]);
		}
		
		
		for (int i = 1; i <= N; i++) {
			System.out.format("%d: {", i);
			for (int j = 0; j < G[i].size(); j++) {
				if (j >= 1) {
					System.out.print(",");
				}
				System.out.print(G[i].get(j));
			}
			System.out.println("}");
		}
	}
}
