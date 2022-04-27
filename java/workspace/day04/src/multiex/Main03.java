package multiex;

public class Main03 {

	public static void main(String[] args) {
		// 문제1. 1~10까지 홀수 값의 합
		int even = 0; //짝수 합계 저장을 위한 변수 선언
		int odd = 0; //홀수 합계 저장을 위한 변수 선언
				
		for(int i = 1; i<=10; i++) {
			if(i%2 == 0) { //짝수 여부 확인
				even = even+i; //기존에 저장된 even값과 i값을 더해서 다시 even 변수에 대입
			}
			else { //홀수 여부 확인
				odd = odd+i;
			}
		}
		System.out.println("짝수 합계 : "+even); //2+4+6+8+10 = 30
		System.out.println("홀수 합계 : "+odd); //1+3+5+7+9 = 25

		
		// 문제2. 1~10까지 짝수 값의 합
		int even = 0;
		
		for(int i = 1; i <= 10; ) {
			if(int) {
				
			}
		}
		
		/*
		 * 문제3. 
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 *  ★★★★★★★★
		 */
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.println("★★★★★★★★");
			}
			System.out.println("");
		}
		
		/*
		 * 문제4. 
		 *  ★★★★★★★★
		 *  ★★★★★★★
		 *  ★★★★★★
		 *  ★★★★★
		 *  ★★★★
		 *  ★★★
		 *  ★★
		 *  ★
		 */
/*		for(int i = 1; i < 9; i--) {
			for(int j = 0; j < 1; j--) {
				System.out.println("★★★★★★★★");
			}
			System.out.println("");
		}
*/		
		
		/*
		 * 문제5. 
		 *  ★
		 *  ★★
		 *  ★★★
		 *  ★★★★
		 *  ★★★★★
		 *  ★★★★★★
		 *  ★★★★★★★
		 *  ★★★★★★★★
		 */
		for(int i = 1; i < 9; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
		/*
		 * 문제6. 2단~9단까지 구구단 출력(결과만 나와도 가능)
		 * 			2중 for문, 2중 while문
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
