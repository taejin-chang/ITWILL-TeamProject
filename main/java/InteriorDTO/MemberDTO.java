package InteriorDTO;


/*

이름           널?       유형            
------------ -------- ------------- 
M_USERID     NOT NULL VARCHAR2(20)  
M_PASSWD     NOT NULL VARCHAR2(20)  
M_ZIPCODE    NOT NULL NUMBER(5)     
M_ADD1       NOT NULL VARCHAR2(100) 
M_ADD2                VARCHAR2(100) 
M_TEL        NOT NULL VARCHAR2(20)  
M_EMAIL      NOT NULL VARCHAR2(100) 
M_NAME       NOT NULL VARCHAR2(20)  
M_GRADE               NUMBER(1)     
M_LAST_LOGIN          DATE 
*/


public class MemberDTO {
	private String m_userid;
	private String m_passwd;
	private String m_zipcode;
	private String m_add1;
	private String m_add2;
	private String m_tel;
	private String m_email;
	private String m_name;
	private int m_grade;
	private String m_last_login;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getM_userid() {
		return m_userid;
	}

	public void setM_userid(String m_userid) {
		this.m_userid = m_userid;
	}

	public String getM_passwd() {
		return m_passwd;
	}

	public void setM_passwd(String m_passwd) {
		this.m_passwd = m_passwd;
	}

	public String getM_zipcode() {
		return m_zipcode;
	}

	public void setM_zipcode(String m_zipcode) {
		this.m_zipcode = m_zipcode;
	}

	public String getM_add1() {
		return m_add1;
	}

	public void setM_add1(String m_add1) {
		this.m_add1 = m_add1;
	}

	public String getM_add2() {
		return m_add2;
	}

	public void setM_add2(String m_add2) {
		this.m_add2 = m_add2;
	}

	public String getM_tel() {
		return m_tel;
	}

	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_grade() {
		return m_grade;
	}

	public void setM_grade(int m_grade) {
		this.m_grade = m_grade;
	}

	public String getM_last_login() {
		return m_last_login;
	}

	public void setM_last_login(String m_last_login) {
		this.m_last_login = m_last_login;
	}

	
	
	
}