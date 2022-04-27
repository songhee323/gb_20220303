package multiex;

public class Main02 {

	public static void main(String[] args) {
		// 1~100까지 홀수의 합
		// while, continue, break
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			i++;
			if(i % 2 == 0) {	// 짝수일 경우
				continue;
			}
			if(i >100) {
				break;
			}
			
			
			sum += i;			// 짝수는 if문에서 다 걸러낼거기 때문에
		}
		
		System.out.println(sum);
		
		
		
	}

}
