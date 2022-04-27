package pattern;

import java.util.regex.Pattern;

public class RegexHelper {

}
	/*
	 * RegexHelper
	 * 1.싱글톤
	 * 2.boolean isValue(String str), 		str : 검사할 문자열, 공백, null체크
	 * 3.boolean isNum(String str), 		str : 검사할 문자열, 숫자형식 검증체크
	 * 4.boolean isEng(String str), 		str : 검사할 문자열, 영문인지 검증체크
	 * 5.boolean isKor(String str), 		str : 검사할 문자열, 한글인지 검증체크
	 * 6.boolean isEngNum(String str), 		str : 검사할 문자열, 영문/숫자인지 검증체크
	 * 7.boolean isKorNum(String str),		str : 검사할 문자열, 한글/숫자인지 검증체크
	 * 8.boolean isEmail(String str), 		str : 검사할 문자열, email인지 검증체크
	 * 9.boolean isCellPhone(String str),	str : 검사할 문자열, 휴대전화번호 인지 검증체크
	 * --------------------------------------------------------------------
	 * main() class에서 해당 메서드 사용
	 */
	
/*	public static void main(String[] args) {
		String value = " ";
		String num = "012345";
		String eng = "abcdefg";
		String kor = "가나다라마바";
		String engNum = "abc123";
		String korNum = "가나다123";
		String email = "student@java.com";
		String cellPhone = "01012345678";
*/		
		//1.싱글톤
		private static RegexHelper current;
		
		public static RegHelper getInstance() {
			if(current == null) {
				current = new Reghelper();
			}
			
			return current;
		}
		
		public static void greeInstance() {
			current = null;
		}
		
		private RegHelper() {
			super();
		}
		
		//--------------------싱글톤 객체 생성 끝---------------------------------
		
		// 2.boolean isValue(String str), 		str : 검사할 문자열, 공백, null체크
		/*
		 * 주어진 문자열이 공백이거나 null 인지를 검사
		 * @param str : 검사할 문자열
		 * @return boolean : 공백, null이 아닐 경우 true 리턴
		 */
//		if(!isValue) {
//			System.out.println("");
//		}
			 

		// 3.boolean isNum(String str), 		str : 검사할 문자열, 숫자형식 검증체크
/*		boolean isNum = Pattern.matches("^[0-9]*$", num);
		
		if(!isNum) {
			System.out.println("숫자로만 입력해주세요.");
			return;
		}
		
		/*
 		* 숫자 모양에 대한 형식 검사
 		* @param str : 검사할 문자열
 		* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
 		*/
		public boolean isNum(String str) {
			boolean result = false;
			
			if(isValue(str)) {
				result = Pattern.matches("^[0-9]*$", str);
			}
			
			return result;
			
		// 4.boolean isEng(String str), 		str : 검사할 문자열, 영문인지 검증체크
/*		boolean isEng = Pattern.matches("^[a-zA-Z]*$", eng);
		
		if(!isEng) {
			System.out.println("영어로만 입력해주세요.");
			return;
		}
*/
			/*
	 		* 영어 모양에 대한 형식 검사
	 		* @param str : 검사할 문자열
	 		* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 		*/
			public boolean isEng(String str) {
				boolean result = false;
				
				if(isValue(str)) {
					result = Pattern.matches("^[a-zA-Z]*$", str);
				}
				
				return result;
				
		// 5.boolean isKor(String str), 		str : 검사할 문자열, 한글인지 검증체크
/*		boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$",kor);
		
		if(!isKor) {
			System.out.println("한글로만 입력해주세요.");
			return;
		}
*/
		/*
		 * 한글에 대한 형식 검사
		* @param str : 검사할 문자열
 		* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
 		*/
		public boolean isKor(String str) {
			boolean result = false;
					
			if(isValue(str)) {
				result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
			}
					
			return result;
			
		// 6.boolean isEngNum(String str), 		str : 검사할 문자열, 영문/숫자인지 검증체크
/*		boolean isEngNum = Pattern.matches("^[a-zA-Z0-9]*$", engNum);
		
		if(!isEngNum) {
			System.out.println("영어와 숫자로만 입력해주세요.");
			return;
		}
*/
		/*
		* 영어와 숫자에 대한 형식 검사
		* @param str : 검사할 문자열
	 	* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 	*/
		public boolean isEngNum(String str) {
			boolean result = false;
						
			if(isValue(str)) {
				result = Pattern.matches("^[a-zA-Z0-9]*$", str);
			}
						
			return result;
			
		// 7.boolean isKorNum(String str),		str : 검사할 문자열, 한글/숫자인지 검증체크
/*		boolean isKorNum = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", korNum);
		
		if(!isKorNum) {
			System.out.println("한글과 숫자로만 입력해주세요.");
			return;
		}
*/
		/*
		* 한글과 숫자에 대한 형식 검사
		* @param str : 검사할 문자열
	 	* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
	 	*/
		public boolean isKorNum(String str) {
			boolean result = false;
							
			if(isValue(str)) {
				result = Pattern.matches("^[a-zA-Z0-9]*$", str);
			}
							
			return result;
			
		// 8.boolean isEmail(String str), 		str : 검사할 문자열, email인지 검증체크
/*		boolean isEmail = Pattern.matches
						("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email);
		
		if(!isEmail) {
			System.out.println("이메일형식으로 입력해주세요.");
			return;
		}
*/
		/*
		* Email에 대한 형식 검사
		* @param str : 검사할 문자열
		* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
		*/
		public boolean isEmail(String str) {
			boolean result = false;
								
			if(isValue(str)) {
				result = Pattern.matches
						("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
			}
								
			return result;
			
		// 9.boolean isCellPhone(String str),	str : 검사할 문자열, 휴대전화번호 인지 검증체크
/*		boolean isCellPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", cellPhone);
		
		if(!isCellPhone) {
			System.out.println("'-'없이 휴대폰 번호만 입력해주세요.");
			return;
		}
*/
			/*
			 * isCellPhone에 대한 형식 검사
			 * @param str : 검사할 문자열
			* @return boolean : 형식에 맞을 경우 true, 맞지 않을 경우 false
			*/
		public boolean isCellPhone(String str) {
			boolean result = false;
								
			if(isValue(str)) {
				result = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
			}
								
			return result;
			
	
		 }
	
}
