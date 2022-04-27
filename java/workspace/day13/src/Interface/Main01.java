package Interface;

public class Main01 {

	public static void main(String[] args) {
		Character ch = new Character("주인공");
		
		ch.walk();
		ch.run();
		ch.attack();
		ch.sheild();
		ch.attack();
		ch.sheild();
		ch.pickup();
		
		System.out.println("-------------------------------------");
		
		Monster ms = new Monster("악당");
		
		ms.attack();
		ms.attack();
		ms.sheild();
		ms.jump();
		ms.run();
		
		
		
	}

}
