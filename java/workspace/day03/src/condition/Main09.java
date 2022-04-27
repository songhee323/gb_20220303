package condition;

public class Main09 {

	public static void main(String[] args) {
		/////////////////////////////  if문 사용
		/*
		 * 문제1. 만약 3000원 이상의 돈을 가지고있으면 택시를 타고 그렇지 않으면 걸어가라
		 * 
		 */
		
		int money = 3000;
				
		if(money >= 3000) {
			System.out.println("택시");
		}
		if(money > 3000) {
			System.out.println("걸어가라");
		}
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 문제2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라
		 */
		
		if(money >= 3000 || ) {
			System.out.println("택시");
		}
		!if(money >= 3000) {
			System.out.println("걸어가라");
		}
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 문제3. 어떤 특정 정수값 a가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		 */
		
		int a = 5;
		
		if(a = ) {
			System.out.println("짝수");
		}
		
		if(a = ) {
			System.out.println("홀수");
		}

		System.out.println("-----------------------------------------");
		
		/*
		 * 문제4. 특정 정수값 a2, b2, c2의 최대값을 구하여라
		 */
		
		int a2 = 10, b2 = 20, c2 = 9;
		
		if() {
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 문제5-1. 국어, 영어, 수학 점수의 평균이 95점 이상이면 장학생을 출력하여라.
		 * 문제5-2. 국어점수가 70점 이상이면 "국어합격" 그렇지않으면 "국어 불합격"을 출력하여라
		 * 문제5-3. 수학점수가 90점이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점",
		 * 			60점 이상이면 "D학점", 나머지 "F"학점"을 출력
		 */
		//5-1
		int korean = 90;
		int engllish = 80;
		int math = 50;
		
		if(average >= 95) {
			System.out.println("장학생");
		}
		
		
		//5-2
		if(korean >= 70) {
			System.out.println("국어합격");
		}if(!korean >= 70) {
			System.out.println("국어 불합격");
		}
		
		//5-3
		if(math >= 90) {
			System.out.println("A학점");
		}else if(math >= 80) {
			System.out.println("B학점");
		}else if(math >= 70) {
			System.out.println("C학점");
		}else if(math >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		System.out.println("-------------switch_case-----------------");
		
		/////////////////////////////////// switch-case 사용
		/*
		 * 문제1. 1은 "축구", 2는 "농구", 3은 "야구", 4는 "배구" 그 외는 "배드민턴"을 출력
		 */
		char workout = '1';
		
		switch (workout) {
		case '1':
			System.out.println("축구");
		case '2':
			System.out.println("농구");
		case '3':
			System.out.println("야구");
		case '4':
			System.out.println("배구");
			break;
		default:
			System.out.println("배드민턴");
			break;
		}
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 문제2. 숫자가 3이면 "안녕"이 세줄, 숫자가 2이면 "안녕"이 두줄, 숫자가 1이면 "안녕"이 한줄, 
		 * 그 외는 "잘가"를 출력
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
