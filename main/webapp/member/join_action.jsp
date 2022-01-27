<%@page import="InteriorDAO.MemberDAO"%>
<%@page import="InteriorDTO.MemberDTO"%>
<%@page import="Util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%request.setCharacterEncoding("utf-8");%>
    
<%
	//비정상적인 요청에 대한 응답처리 - 에러페이지 이동
	if(request.getMethod().equals("GET")) {
		//템플릿 페이지(index.jsp)의 Content 영역에 포함되는 JSP 문서이므로 리다이렉트 이동 불가능
		// => 자바스크립트를 이용하여 페이지 이동
		//response.sendRedirect(request.getContextPath()+"/site/index.jsp?workgroup=error&work=error400");
		//return;
		
		out.println("<script type='text/javascript'>");
		out.println("location.href='"+request.getContextPath()+"/index.jsp?workgroup=error&work=error400';");
		out.println("</script>");
		return;
	}

	String id=request.getParameter("id");
	String passwd=request.getParameter("passwd");
	String name=request.getParameter("name");
	String zipcode=request.getParameter("zipcode");
	String add1=request.getParameter("add1");
	String add2=request.getParameter("add2");
	String tel=request.getParameter("mobile1")+"-"+request.getParameter("mobile2")+"-"+request.getParameter("mobile3");
	String email=request.getParameter("email");
	
	MemberDTO member=new MemberDTO();
	member.setM_userid(id);
	member.setM_passwd(passwd);
	member.setM_name(name);
	member.setM_email(email);
	member.setM_tel(tel);
	member.setM_zipcode(zipcode);
	member.setM_add1(add1);
	member.setM_add2(add2);
	
	MemberDAO.getDAO().insertMember(member);
	
	out.println("<script type='text/javascript'>");
	out.println("location.href='"+request.getContextPath()+"/index.jsp?workgroup=member&work=login';");
	out.println("</script>");
%>