package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("첫번째 질문입니다.");
		qna.setAnswer("첫번째 질문입니다.");
		
//		System.out.println(qna.getNum());
//		System.out.println(qna.getTitle());
//		System.out.println(qna.getAnswer());
		
//		System.out.println("질문/답변 [글번호 = " + getNum() + ", 제목= " + getTitle()
//		+ ", 답변= " + getAnswer());
		
		System.out.println(qna.toString());
		
		
	}

}
