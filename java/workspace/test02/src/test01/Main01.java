package test01;

public class Main01 {

	public static void main(String[] args) {

		Calc c  = new Calc();
		
		int p = c.plus(20, 10);
		System.out.println("20 + 10 = " + p);
		
		System.out.println("20 - 10 = " + c.minus(20, 10));
		
		System.out.println("20 * 10 = " + c.times(20, 10));
		
		System.out.println("20 / 10 = " + c.divide(20, 10));
	}
	
class StudentUser{
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

		StudentUser s = new StudentUser();
		s.setName = ("추송희");
		System.out.println(s.getName());
	
	
	
	
	
		
	
	
}
