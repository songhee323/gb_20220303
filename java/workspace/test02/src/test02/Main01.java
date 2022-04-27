package test02;

public class Main01 {

	public static void main(String[] args) {

		Student std = new Student("추송희", 1, 1, 80, 90, 70);
				
		System.out.println(std.getTotal());
		System.out.println(std.getAvg());
	}
			
	void name() {	}
	void ban() {	}
	void no() {	}
	void kor() {	}
	void eng() {	}
	void math() {	}
	
	public static void Student( ){
		Student name;
		Student ban;
		Student no;
		Student kor;
		Student eng;
		Student math;
		
		System.out.println(.name, std.ban, std.no, std.kor, eng, math);
	}
	

}
	/*
	7. main 메서드를 포함하는 클래를 생성(10)
	8. Student 클래스 객체 생성(10)
	9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)
	10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출(10)
	 */