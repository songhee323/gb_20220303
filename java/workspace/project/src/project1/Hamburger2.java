package project1;

import java.util.Scanner;

public class Hamburger2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;	//사용자가 입력한 메뉴 번호를 담아줄 저장공간
		String pw = "";	//관리자가 입력한 비밀번호를 담아줄 저장공간
		String adminCode = "1234";	//관리자코드
		int total = 0;	//총 금액을 저장할 저장공간
		
		System.out.println("안녕하세요. 자바버거입니다!");
		while(true) {
			// 메인메뉴 출력하기
			System.out.println("1. 주문하기  2. 관리자메뉴 ");
			choice = sc.nextInt();
			
			// 사용자가 입력한값이 1이라면
			if(choice == 1) {
				total = 0;	// 총금액을 0으로 초기화 해준다.
				while (true) {
					// 주문 메뉴 출력하기
					System.out.println("1. 불고기버거\t3000원");
					System.out.println("2. 새우버거\t3500원");
					System.out.println("3. 감자튀김\t1500원");
					System.out.println("4. 콜라 	 \t1000원");
					System.out.println("5. 주문하기");
					choice = sc.nextInt();
					if (choice == 1) {
						// 총금액이 3000원 누적연산
						total += 3000;
						System.out.println("불고기버거 한개가 추가되었습니다. 합계 : " + total + "원");
					} else if (choice == 2) {
						// 3500원 누적
						total += 3500;
						System.out.println("새우버거 한개가 추가되었습니다. 합계 : " + total + "원");
					} else if (choice == 3) {
						// 1500원 누적
						total += 1500;
						System.out.println("감자튀김 한개가 추가되었습니다. 합계 :" + total + "원");
					} else if (choice == 4) {
						// 1000원 누적
						total += 1000;
						System.out.println("콜라 한개가 추가되었습니다. 합계 : " + total + "원");
					} else if (choice == 5) {
						System.out.println(total + "원을 넣어주세요 >> ");
						choice = sc.nextInt();	// 사용자가 입력한 금액
						
						// 사용자가 입력한 금액이 내야할 돈보다 적다면
						if(choice < total) {
							// 잔액부족
							System.out.println("잔액이 부족합니다.");
							break;	// 주문 while문을 종료하므로 다시 메인 메뉴로 돌아가게 된다
						}
						System.out.println("주문이 완료되었습니다.");
						// 잔돈이 있을때만 메시지 출력하기
						if(choice - total != 0) {
						System.out.println("잔돈 " + (choice - total) + "원이 반환되었습니다.");
						}
						break;	// 메인메뉴로 돌아가기
					} else {
						// 사용자가 햄버거, 감튀 콜라, 주문하기외를 입력했을때 오는영역
						System.out.println("다시 입력하십시오!");
					}
				}
				
				
			} else if(choice == 2) {
				// 관리자 메뉴 영역
				// 비밀번호를 입력
				System.out.println("관리자 비밀번호 입력 >> ");
				pw = sc.next();
				// 만약 관리자가 입력한 pw가 adminCode랑 똑같다면
				if(pw.equals(adminCode)) {
					// 1을 누르면 종료 나머지를 누르면 다시 메인메뉴로 이동
					System.out.println("프로그램 종료하시겠습니까?(1. 예 2. 아니오)");
					choice = sc.nextInt();
					
					if(choice != 1) {
						System.out.println("메인 메뉴로 돌아갑니다!");
						continue;	// 즉시 다음반복으로 이동(메인메뉴로 이동)
					} 
					System.out.println("프로그램을 종료합니다!");
					break;
					
				} else {
					// 아니라면 비밀번호 오류: 메인메뉴로 이동합니다!
					System.out.println("비밀번호 오류! 메인 메뉴로 이동합니다.");
				}
				
			} else {
				// 잘못입력한 영역
				// 메인메뉴에서 잘못 입력했을 경우 오는 영역
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
		
		
		
		
		
		
		
		
	}

}
