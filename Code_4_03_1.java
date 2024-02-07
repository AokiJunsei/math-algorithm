import java.util.*;

class Code_4_03_1 {
	public static void main(String[] args) {
		double r = 2.0;
		double a = 2.0;
		for (int i = 1; i <= 5; i++) {
			
			double zahyou_x = a;
			double zahyou_y = a * a;
			
			//y = sessen_a * x + sessen_b
			double sessen_a = 2.0 * zahyou_x;
			double sessen_b = zahyou_y - sessen_a * zahyou_x;
			
			//next_a
			double next_a = (r - sessen_b) / sessen_a;
			System.out.format("Step #%d: a = %.12f -> %.12f\n", i, a, next_a);
			a = next_a;
		}
	}
}
