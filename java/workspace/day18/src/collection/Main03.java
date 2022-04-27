package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// people class로 ArrayList 생성
		/*
		 * List를 사요아느 가장 일반적인 반응
		 * 사용자 저의 클래스에 대한 객체를 포함하도록 지정하는 것이다.
		 */
		List<People> plist = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가
//		plist.add(new People("회원 1 ", "010-1234-5670"));
//		plist.add(new People("회원 2 ", "010-1234-5671"));
//		plist.add(new People("회원 3 ", "010-1234-5672"));
//		plist.add(new People("회원 4 ", "010-1234-5673"));
//		plist.add(new People("회원 5 ", "010-1234-5674"));
//		plist.add(new People("회원 6 ", "010-1234-5675"));
//		plist.add(new People("회원 7 ", "010-1234-5676"));
//		plist.add(new People("회원 8 ", "010-1234-5677"));
//		plist.add(new People("회원 9 ", "010-1234-5678"));
//		plist.add(new People("회원 10 ", "010-1234-5679"));
		
		for(int i = 0; i<10; i++) {
			People p = new People("회원" + i, "010-1234-5678" + i);
			plist.add(p);
		}
		
		// 출력하기
		for(int i = 0; i<plist.size(); i++) {
			// List에 저장된 데이터를 하나 꺼내면, 
			// People 클래스 형의 객체다
			People item = plist.get(i);
			System.out.println(item.toString());
		}
		
		
		
	}

}
