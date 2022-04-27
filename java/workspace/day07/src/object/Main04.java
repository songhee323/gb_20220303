package object;

class Calc{
	// plus, param in x, int y, return
		int x = 100;
		int y = 200;
		int plus(int x, int y) {
			return x + y;
		}
	// minus, param in x, int y, return
		int minus(int x, int y) {
			return x - y;
		}
	// times, param in x, int y, return
		int times(int x, int y) {
			return x * y;
		}
	// divide, param in x, int y, return
		int divide(int x, int y) {
			int result = 0;
			if(y != 0) {
				result = x / y;
			}
			return result;
		}
}

public class Main04 {

	public static void main(String[] args) {
		// 객체 생성
		Calc c = new Calc();

		// plus
		int p = c.plus(100,500);
		System.out.println("100 + 50 = " + p);
		
		// minus
		System.out.println("100 - 50 = " + c.minus(100, 50));
		
		// times
		System.out.println("100 * 50 = " + c.times(100, 50));
		
		// divide
		System.out.println("100 / 50 = " + c.divide(100, 50));
		
		
	}

}
