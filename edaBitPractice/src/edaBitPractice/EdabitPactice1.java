package edaBitPractice;

public class EdabitPactice1 {

	static int addUpTo(int n) {
		int total = 0;
		for(int i = 0; i <= n; i++) {
			total += i;
		};
		
		return total;
	}
	
	public static void main(System[] args) {
		
		addUpTo(6);
		
	}
}