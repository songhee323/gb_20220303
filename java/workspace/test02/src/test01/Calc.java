package test01;

class Student{
	String name = "자바학생";
	int age = 22;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class Calc{
	int x = 10;
	int y = 20;
	
	int plus(int x , int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	int times(int x, int y) {
		return x * y;
	}
	
	int divide(int x, int y) {
		int result = 0;
		if(y != 0) {
			result = x / y;
		}
		return result;
	}
	
	
}

/*	1. Calc 클래스를 생성 한다.(10점)
	2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.(10점)
	3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.(5점)
	4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.(5점)
	5.int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.(5점)
	6.int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다. (5점)
	7.main 메서드를 포함하는 클래스를 생성 한다.(10점)
	8. 2개의 정수를 입력 받는다.(10점)
	9.입력 받은 정수를 각각 출력 한다.(10점)
	10.main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.(5점)
	11.main 메서드에서 본인의 이름을 출력한다.(5점)
	12.Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
	13.Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
*/	
	
