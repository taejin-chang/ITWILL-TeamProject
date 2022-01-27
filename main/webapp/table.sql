create table member (
	m_userid varchar2(20) not null ,	-- 회원 ID 
	m_passwd varchar2(20) not null,		-- 비밀번호
	m_zipcode number(5) not null,		-- 우편번호
	m_add1 varchar2(100) not null, 	    -- 기본주소
	m_add2 varchar2(100) ,              -- 나머지 주소
	m_tel varchar2(20) not null,        -- 전화번호
	m_email varchar2(100) not null,     -- 이메일
	m_name varchar2(20) not null, -- 회원이름
	m_grade number(1) not null,         --등급  0:탈퇴 1:일반 9:관리자 
	m_last_login date null, 			--마지막 로그인 -->not null에서-->null로변경o
	primary key(m_userid)			-- 기본키 : 회원 ID
);

create table product (
	p_no varchar2(20) not null ,	-- 상품 번호  
	p_name varchar2(100) not null,		-- 상품명
	p_kinds varchar2(4) not null,		-- 상품분류
	p_price number(20) not null, 	    -- 상품가격
	p_amount number(20) not null,        -- 상품 수량
	p_imgsrc varchar2(2000) ,        -- 상품 이미지 파일명
	primary key(p_no)			-- 기본키 : 상품번호 
);

create table cart (
	c_no varchar2(20) not null ,	-- 장바구니 번호
	p_no varchar2(20) not null,		-- 상품번호
	m_userid varchar2(20) not null, -- 회원ID
	c_amount number not null,	-- 총수량
	primary key(c_no)			-- 기본키 : 장바구니 번호
);

create sequence cart_seq_no;

create table orders (
	o_no varchar2(20) not null ,	-- 주문번호
	m_userid varchar2(20) not null, -- 회원ID
	m_tel varchar2(20) not null,  	-- 휴대폰
	m_email varchar2(60) not null,	-- 이메일
	o_amount number(5) not null,	-- 주문 개수
	m_add1	varchar2(100) not null, -- 기본주소
	m_add2 varchar2(100) ,			-- 나머지 주소
	o_stat varchar2(100) default 0 not null ,  -- 주문상태   주문시 : 1 ---> 기본값 0 으로입력
	o_msg varchar2(200) , 			-- 요청사항
	p_no varchar2(20)  not null,	-- 상품번호 
	primary key(o_no)			-- 기본키 : 주문번호
);

create sequence o_no;

create table notice (
	n_no number(20) not null ,		   -- 글 번호
	m_userid varchar2(20) ,     	   -- 회원ID
	n_title varchar2(100) not null,   -- 제목
	n_content varchar2(2000) not null, -- 내용
	n_regdate date 	default sysdate,   -- 작성일
	primary key(n_no)			-- 기본키 : 공지사항 글 번호
);
	
create sequence notice_seq_no;


create table answer (
	an_no number not null ,		   -- 댓글 번호
	an_id varchar2(20) not null,   -- 댓글 아이디
	an_date date default sysdate ,   -- 댓글 작성일
	an_content varchar2(1000) not null, -- 댓글 내용
	primary key(an_no)			-- 기본키 : 댓글 번호
);


create sequence an_seq_no;

create table board (
	b_no number not null ,		   -- 글 번호 
	m_userid varchar2(20) not null,   -- 회원 아이디
	m_writer varchar2(20) not null ,   -- 회원이름(작성자)
	b_title varchar2(1000) not null, -- 댓글 내용
	b_content varchar2(2000) not null, -- 내용
	b_img varchar2(100),            -- 첨부파일
	b_date date default sysdate,  	-- 작성일 
	b_count number default 0,        --조회수 -->null로 변경
	b_status number default 0 not null, --상태  ?????? 
	primary key(b_no)			-- 기본키 : 글 번호
);   

create sequence b_seq_no; 

create table review (
	r_no number not null ,		   	  -- 글 번호 
	m_userid varchar2(20) not null,   -- 회원 아이디
	r_title varchar2(20) not null ,   -- 글 제목
	r_content varchar2(2000) not null,-- 글 내용
	r_date date default sysdate, 	  -- 글 작성일 -->not null->null로 변경 
	r_count number default 0,         --조회수 -->null로 변경
	r_img varchar2(500),              -- 첨부파일
	p_no varchar2(20) ,  --상태  ??????  
	primary key(r_no)				  -- 기본키 : 글 번호
);

create sequence r_seq_no;

create table quenstion (
	q_no number not null ,		   	      -- 문의 글 번호 
	m_userid varchar2(20) not null,       -- 회원 아이디
	m_writer varchar2(20) not null ,      -- 회원 이름(작성자)
	q_title varchar2(100) not null,       -- 문의 제목
	q_content varchar2(2000) not null,    -- 문의 내용 
	q_date date default sysdate,          --문의 작성일   -->null로 변경
	q_count number default 0,             -- 문의 조회수  -->null로 변경
	q_status varchar2(20) ,  --비밀글 여부   -->null로 변경  
	q_andate date default sysdate ,       --댓글 작성일  
	q_answer varchar2(2000) ,  			  --댓글 내용
	p_no number  ,  	      			  --상품번호  
	q_anno varchar2(20)  ,    --댓글 번호   : 시퀀스부여
	primary key(q_no)				  -- 기본키 : 문의 글 번호
);

create sequence q_seq_no;

create sequence q_seq_an_no; 
