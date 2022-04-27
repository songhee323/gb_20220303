package project1;

import java.util.Scanner;

public class Hamburger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		String pw = "";
		String adminCode = "1234";
		int total = 0;
		
		System.out.println("안녕하세요. 자바버거입니다!");
		while(true) {
			System.out.println("1. 주문하기  2. 관리자 메뉴 ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				total = 0;
				
				while (true) {
					System.out.println(" < 메 뉴 > ");
					System.out.println("1. 불고기버거\t3000원");
					System.out.println("2. 새우버거\t3500원");
					System.out.println("3. 감자튀김\t1500원");
					System.out.println("4. 콜라 	 \t1000원");
					System.out.println("5. 주문하기");
					choice = sc.nextInt();
					
					if (choice == 1) {
						total += 3000;
						System.out.println("불고기버거 한개가 추가되었습니다. 합계 : " + total + "원");
						
					} else if (choice == 2) {
						total += 3500;
						System.out.println("새우버거 한개가 추가되었습니다. 합계 : " + total + "원");
						
					} else if (choice == 3) {
						total += 1500;
						System.out.println("감자튀김 한개가 추가되었습니다. 합계 :" + total + "원");
						
					} else if (choice == 4) {
						total += 1000;
						System.out.println("콜라 한개가 추가되었습니다. 합계 : " + total + "원");
					
					} else if (choice == 5) {
						System.out.println("-----------------------------");
						System.out.println(total + "원을 넣어주세요 >> ");
						choice = sc.nextInt();
						
						if(choice < total) {
							System.out.println("잔액이 부족합니다.");
							break;
						}
						System.out.println("주문이 완료되었습니다.");
						
						if(choice - total != 0) {
						System.out.println("잔돈 " + (choice - total) + "원이 반환되었습니다.");
						}
						break;
					} else {
						System.out.println("다시 입력하십시오!");
					}
				}
				
				
			} else if(choice == 2) {
				System.out.println("관리자 비밀번호 입력 >> ");
				pw = sc.next();
				
				if(pw.equals(adminCode)) {
					System.out.println("관리자님 프로그램 종료하시겠습니까?(1. 예 2. 아니오)");
					choice = sc.nextInt();
					
					if(choice != 1) {
						System.out.println("메인 메뉴로 돌아갑니다!");
						continue;	
					} 
					System.out.println("프로그램을 종료합니다!");
					break;
					
				} else {
					System.out.println("비밀번호 오류! 메인 메뉴로 이동합니다.");
				}
				
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
		
		
		
		
		
		
		
		
	}

}
