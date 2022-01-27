package InteriorDTO;/*
				이름       널?       유형           
				-------- -------- ------------ 
				C_NO     NOT NULL VARCHAR2(20) 
				P_NO     NOT NULL VARCHAR2(20) 
				M_USERID NOT NULL VARCHAR2(20) 
				C_AMOUNT NOT NULL NUMBER    */
public class CartDTO {
	private String c_no;
	private String p_no;
	private String m_userid;
	private int c_amount;
	
	public CartDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public String getP_no() {
		return p_no;
	}

	public void setP_no(String p_no) {
		this.p_no = p_no;
	}

	public String getM_userid() {
		return m_userid;
	}

	public void setM_userid(String m_userid) {
		this.m_userid = m_userid;
	}

	public int getC_amount() {
		return c_amount;
	}

	public void setC_amount(int c_amount) {
		this.c_amount = c_amount;
	}
	
	
}
