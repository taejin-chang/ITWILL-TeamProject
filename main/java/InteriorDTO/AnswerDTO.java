package InteriorDTO;
/*
이름         널?       유형             
---------- -------- -------------- 
AN_NO      NOT NULL NUMBER         - 댓글 번호
AN_ID      NOT NULL VARCHAR2(20)   - 댓글 아이디
AN_DATE             DATE           - 댓글 작성일
AN_CONTENT NOT NULL VARCHAR2(1000) - 댓글 내용
*/
public class AnswerDTO {
	private int an_no;
	private String an_id;
	private String an_date;
	private String an_content;
	
	public AnswerDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getAn_no() {
		return an_no;
	}

	public void setAn_no(int an_no) {
		this.an_no = an_no;
	}

	public String getAn_id() {
		return an_id;
	}

	public void setAn_id(String an_id) {
		this.an_id = an_id;
	}

	public String getAn_date() {
		return an_date;
	}

	public void setAn_date(String an_date) {
		this.an_date = an_date;
	}

	public String getAn_content() {
		return an_content;
	}

	public void setAn_content(String an_content) {
		this.an_content = an_content;
	}
	
}
