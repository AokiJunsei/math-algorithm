import java.util.*;

class Code_4_01_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long ax = sc.nextInt(), ay = sc.nextInt();
		long bx = sc.nextInt(), by = sc.nextInt();
		long cx = sc.nextInt(), cy = sc.nextInt();
		
		
		long BAx = ax - bx, BAy = ay - by;
		long BCx = cx - bx, BCy = cy - by;
		long CAx = ax - cx, CAy = ay - cy;
		long CBx = bx - cx, CBy = by - cy;
		
		
		int pattern = 2;
		if (BAx * BCx + BAy * BCy < 0L) {
			pattern = 1;
		}
		if (CAx * CBx + CAy * CBy < 0L) {
			pattern = 3;
		}
		
		
		double answer = 0.0;
		if (pattern == 1) {
			answer = Math.sqrt(BAx * BAx + BAy * BAy);
		}
		if (pattern == 3) {
			answer = Math.sqrt(CAx * CAx + CAy * CAy);
		}
		if (pattern == 2) {
			double S = Math.abs(BAx * BCy - BAy * BCx);
			double BCLength = Math.sqrt(BCx * BCx + BCy * BCy);
			answer = S / BCLength;
		}
		
		
		System.out.format("%.12f\n", answer);
	}
}
