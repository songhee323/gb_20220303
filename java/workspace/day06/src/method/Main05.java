package method;

/*
 * 문제1. "Hello, World~" , "메서드가 호출되었습니다." 를
 * 출력하는 메서드를 각각 만들어 호출하세요. 
 */

public class Main05 {

	public static void main(String[] args) {
		helloWorld();
		showMsg();
		
	}

	public static void helloWorld() {
		System.out.println("Hello, World~");
	}
	
	public static void showMsg() {
		System.out.println("메서드가 호출되었습니다.");
	}
	
	
}
