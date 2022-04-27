package extendsclass;

public class FileArticle extends Article{
	private String fileName;

	public String getFieName() {
		return fileName;
	}

	public void setFieName(String fieName, String fileName) {
		this.fileName = fileName;
	}
	
	public String toString() {
		return "자료실[번호 = " + getNum() + ", 제목= " + getTitle() + ", 첨부파일= " + getFileName() + " ]";
	}
	
	FileArticle file = new FileArticle();
	file.setNum(10);
	file.setTitile("10번째 자료입니다.");
	file.setFileName("day10.ppt");
	System.out.println(file.toString());    
	

	}
	
	
	
	
}
