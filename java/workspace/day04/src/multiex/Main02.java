package multiex;

public class Main02 {

	public static void main(String[] args) {
		// 70보다 크고, 80보다 작거나 같으면 C등급이다.
		// 77점 이상이면 C+, 74점 이하면 C-, 그와는 C0
		
		int point = 78;
		
		if(point > 70 && point <= 80) {
			//c등급
			if(point > 77) {
				System.out.println("C+ 등급입니다.");
			} else if (point < 74) {
				System.out.println("C- 등급입니다.");
			} else {
				System.out.println("C0 등급입니다.");
			}
		}

		
		
		
		
		
	}

}
