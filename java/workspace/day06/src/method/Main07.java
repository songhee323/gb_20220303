package method;

/*
 *  문제3. 반환 값이 있고 받는 인자값이 없는 메서드를 구현하세요
 */

public class Main07 {

	public static void main(String[] args) {
		int rMethod = returnMethod();
		System.out.println(rMethod);
		// System.out.println(returnMethod());
	}

	public static int returnMethod() {
		int x = 100; 
		return x;
	}
	
}
