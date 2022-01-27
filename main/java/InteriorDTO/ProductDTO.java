package InteriorDTO;

/*
P_NO     NOT NULL VARCHAR2(20)   
P_NAME   NOT NULL VARCHAR2(100)  
P_KINDS  NOT NULL VARCHAR2(4)    
P_PRICE  NOT NULL NUMBER(20)     
P_AMOUNT NOT NULL NUMBER(20)     
P_IMGSRC          VARCHAR2(2000)*/
public class ProductDTO {
	private String p_no;
	private String p_name;
	private String p_kinds;
	private int p_price;
	private int p_amount;
	private String p_imgsrc;

	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getP_no() {
		return p_no;
	}


	public void setP_no(String p_no) {
		this.p_no = p_no;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}


	public String getP_kinds() {
		return p_kinds;
	}


	public void setP_kinds(String p_kinds) {
		this.p_kinds = p_kinds;
	}


	public int getP_price() {
		return p_price;
	}


	public void setP_price(int p_price) {
		this.p_price = p_price;
	}


	public int getP_amount() {
		return p_amount;
	}


	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}


	public String getP_imgsrc() {
		return p_imgsrc;
	}


	public void setP_imgsrc(String p_imgsrc) {
		this.p_imgsrc = p_imgsrc;
	}
	
	
	
	
	
	
	
}


