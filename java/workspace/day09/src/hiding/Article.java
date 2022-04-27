package hiding;

// 하나의 게시물을 표현하기 위한 JavaBeans
public class Article {
	private int seq;			// 글 번호
	private String subject;		// 글 제목
	private String content;		// 글 내용
	private String writer;		// 작성자
	private int hit;			// 조회수
	private String regDate;		// 작성일자
	
	// 파라미터가 있는 생성자
	public Article(int seq, String subject, String content, String writer, int hit, String regDate) {
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}
	
/*	public Article(int seq, String subject, String content, String writer, int hit, String regDate) {
		this.seq = seq;
		this.subject = subject; 
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}
*/	
	// getter, setter 추가

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	// main 메서드를 포함하고 있는 클래스에서 
	// 객체 생성 및 항목들 출력
	public static void main(String[] args) {
		Article a = new Article(3, "자바란?", "자바는 객체지향 언어이다", "자바학생", 50, "3월 17일");
		
		System.out.println("글 번호: " + a.getSeq());
		System.out.println("글 제목: " + a.getSubject());
		System.out.println("글 내용: " + a.getContent());
		System.out.println("작성자: " + a.getWriter());
		System.out.println("조회수: " + a.getHit());
		System.out.println("작성일자: " + a.getRegDate());
	}
}
