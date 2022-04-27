package hiding;

public class Main02 {

	public static void main(String[] args) {
		// Member 클래스 객체생성
		Member m = new Member("JAVA학생", 25);
		
		
	//	Member mem = new Member(null, 0);
		
		// name, age 각각 출력
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
				
	//	mem.setAge(20);
	//	mem.setName("자바학생");
		
	//	System.out.println(mem.getAge());
	//	System.out.println(mem.getName());
	}

}
