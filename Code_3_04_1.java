import java.util.*;

class Code_3_04_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N + 1];
		int[] R = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			R[i] = sc.nextInt();
		}
		
		
		double blue = 0.0, red = 0.0;
		for (int i = 1; i <= N; i++) {
			blue += (double)B[i] / N;
			red += (double)R[i] / N;
		}
		System.out.format("%.12f\n", blue + red);
	}
}
