package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article art = new Article(1, "테스트게시물", "첫번째 게시물", "JAVA학생", 0, "2022-03-17");
		
		System.out.println("글 번호: " + art.getSeq());
		System.out.println("글 제목: " + art.getSubject());
		System.out.println("글 내용: " + art.getContent());
		System.out.println("작성자: " + art.getWriter());
		System.out.println("조회수: " + art.getHit());
		System.out.println("작성일자: " + art.getRegDate());
	}

}
