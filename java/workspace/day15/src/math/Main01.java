package math;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * java.lang.Math 클래스
		 * --------------------------------------------
		 * 수학과 관련된 메서드들을 갖고 있는 클래스
		 * 모든 메서드들이 static 형태이기 때문에, 객체를 생성할 필요가 없다.
		 */
		
		// 주어진 두 수에 대한 최대값 구하기
		int max = Math.max(100, 9999);
		System.out.println("최대값 = " + max);
		
		int min = Math.min(100, 9999);
		System.out.println("최소값 = " + min);
		
		// 주어진 두 수에 대한 절단값 구하기
		int abs = Math.abs(-123);
		System.out.println("절대값 = " + abs);
		
		// 소수점 반올림
		long num = Math.round(3.62345);
		System.out.println("소수점 반올림 = " + num);
		
		// 원주율 3.141592....
		System.out.println("원주율 = " + Math.PI);
		
		// 지수, 로그, 제곱근
		System.out.println("log(5) = " + Math.log(5));
		System.out.println("log(5) = " + Math.log(Math.log(5)));
		System.out.println();
		
		
	}

}
