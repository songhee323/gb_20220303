package overload;

public class Member {
	private String job;
	private int age;
	
	// 기본 생성자
	public Member() {
		
	}
	
	// age를 param값으로, 생성자
	public Member(int age) {
		this.age = age;
	}
	
	// job을 param값으로, 생성자
	public Member(String job) {
		this.job = job;
	}
	
	// job, age를 param값으로, 생성자
	public Member(String job, int age) {
		this.job = job;
		this.age = age;
	}

	// 클래스명, job, age를 출력해주는 toString()
	@Override
	public String toString() {
		return "Member [job=" + job + ", age=" + age + "]";
	}
	
	
	
/*	public String toString() {
		return "Member [job = " + job + ", age = " + age + "]";
	}
*/
	
	// main() 클래스 생성, 객체생성을 생성자타입별로 생성후, 출력
	
}
