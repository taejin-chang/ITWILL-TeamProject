<%@page import="InteriorDAO.MemberDAO"%>
<%@page import="InteriorDTO.MemberDTO"%>
<%@page import="Util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
    
<%
	//비정상적인 요청에 대한 응답처리 - 에러페이지 이동
	if(request.getMethod().equals("GET")) {
		out.println("<script type='text/javascript'>");
		out.println("location.href='"+request.getContextPath()+"index.jsp?workgroup=error&work=error400';");
		out.println("</script>");
		return;
	}	
	
	//전달값을 반환받아 저장
	//String id=request.getParameter("id");
	//String pass=Utility.encrypt(request.getParameter("passwd"));
	
	String id = request.getParameter("id");
	String pass = request.getParameter("passwd");
	int row = MemberDAO.getDAO().loginMember(id, pass);
	out.println(row);


	
%>

<%if(row==1){%>
	<script type="text/javascript">
	alert("성공");
	location.href="../index.jsp"
	</script>
	

<%}else{ %>
	<script type="text/javascript">
		alert("실패");
		history.back();
		
</script>

<%} %>

