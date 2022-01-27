package InteriorDTO;
/*
O_NO     NOT NULL VARCHAR2(20)  
M_USERID NOT NULL VARCHAR2(20)  
M_TEL    NOT NULL VARCHAR2(20)  
M_EMAIL  NOT NULL VARCHAR2(60)  
O_AMOUNT NOT NULL NUMBER(5)     
M_ADD1   NOT NULL VARCHAR2(100) 
M_ADD2            VARCHAR2(100) 
O_STAT   NOT NULL VARCHAR2(100) 
O_MSG             VARCHAR2(200) 
P_NO     NOT NULL VARCHAR2(20)  
*/
public class OrdersDTO {
	private String o_no;
	private String m_userid;
	private String m_tel;
	private String m_email;
	private int  o_amount;
	private String m_add1;
	private String m_add2;
	private String o_stat;
	private String o_msg;
	private String p_no;
	
	public OrdersDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getO_no() {
		return o_no;
	}

	public void setO_no(String o_no) {
		this.o_no = o_no;
	}

	public String getM_userid() {
		return m_userid;
	}

	public void setM_userid(String m_userid) {
		this.m_userid = m_userid;
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

	public int getO_amount() {
		return o_amount;
	}

	public void setO_amount(int o_amount) {
		this.o_amount = o_amount;
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

	public String getO_stat() {
		return o_stat;
	}

	public void setO_stat(String o_stat) {
		this.o_stat = o_stat;
	}

	public String getO_msg() {
		return o_msg;
	}

	public void setO_msg(String o_msg) {
		this.o_msg = o_msg;
	}

	public String getP_no() {
		return p_no;
	}

	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	
	
}
