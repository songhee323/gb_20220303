package overload;

public class Main04 {

	public static void main(String[] args) {
		Article a1 = new Article(1, "첫 번째 게시물", "자바학생");
		System.out.println(a1.toString());
		
		Article a2 = new Article(2, "자바학생2");
		System.out.println(a2);
		
		Article a3 = new Article(3);
		System.out.println(a3);
				
	}

}
