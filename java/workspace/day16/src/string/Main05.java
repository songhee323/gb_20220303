package string;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라고하는 객체로 생성한 뒤에, 다음의 형태로 출력하시오
		 * (split() 메서드 사용 금지)
		 * ----------------------------------------------------
		 * 파일이름	: food
		 * 확장자		: jpg
		 * 폴더명		: D:/photo/2022/travel
		 */
		
		String data = "D:/photo/2022/travel/food.jpg";
		
		// 파일이름 추출
		String name = data.substring(data.lastIndexOf("/")+ 1,
									data.lastIndexOf("."));
		System.out.println("파일이름 = " + name);
		
		// 확장자 추출
		String ext = data.substring(data.lastIndexOf(".") + 1);
		System.out.println("확장자 = " + ext);
		
		// 소스파일 폴더이름 추출
		System.out.println("폴더명 = " + data.substring(0,data.lastIndexOf("/")));
		
		
		
		
		
/*		String src = "D:/photo/2022/travel/food.jpg";
		String[] data = src.split("/" + "");
		
		for(int i = 0; i < data.length; i++) {
			System.out.println("파일이름 : " + data[i]);
			System.out.println("확장자 : " + );
		System.out.println("폴더명 : " + );
*/
		
		
		
		

	}

}
