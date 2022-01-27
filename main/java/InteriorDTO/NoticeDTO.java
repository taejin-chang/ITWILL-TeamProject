package InteriorDTO;
/*

create table notice (
		n_no number(20) not null ,		    -- 글 번호
		m_userid varchar2(20) ,     	    -- 회원ID
		n_title varchar2(100) not null,     -- 제목
		n_content varchar2(2000) not null,  -- 내용
		n_regdate date 	default sysdate,    -- 작성일
		n_count number default 				-- 조회수
		primary key(n_no)					-- 기본키 : 공지사항 글 번호
		
	);
	
create sequence notice_seq_no;

*/
public class NoticeDTO {
	private int n_no;
	private String m_userid;
	private String n_title;
	private String n_content;
	private String n_regdate;
	private int n_count;
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getN_no() {
		return n_no;
	}

	public void setN_no(int n_no) {
		this.n_no = n_no;
	}

	public String getM_userid() {
		return m_userid;
	}

	public void setM_userid(String m_userid) {
		this.m_userid = m_userid;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public String getN_regdate() {
		return n_regdate;
	}

	public void setN_regdate(String n_regdate) {
		this.n_regdate = n_regdate;
	}

	public int getN_count() {
		return n_count;
	}

	public void setN_count(int n_count) {
		this.n_count = n_count;
	}

	
}
