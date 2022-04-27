package math;

/*
 * 랜던값 생성하기
 * -------------------------------------
 * Math.random() 메서드는 0~1 범위를 갖는  double형의 값을
 * 리턴하기 때문에, 원한는 범위의 값을 생성하기 위해서는 
 * 일련의 공식 적용이 필요한다.
 */

public class Main02 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		System.out.println(random(1, 10));
	}

	// 범위를 갖는 랜던값을 생성하여 리턴하는 메서드
	public static int random(int min, int max) {
		int num = (int)((Math.random() * (max - min  + 1)) + min);
		return num;
	}
	
	
	
	
}
