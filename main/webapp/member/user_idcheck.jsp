<%@page import="InteriorDAO.MemberDAO"%>
<%@page import="InteriorDTO.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%


	String id = request.getParameter("id");
	
	MemberDTO member = MemberDAO.getDAO().selectIdMember(id);
%>

<script type="text/javascript">
function send(){
	opener.joinForm.id.value="<%=id%>";
	opener.joinForm.idCheckResult.value=1;
	window.close();//창닫기
	check.action="join2.jsp";
	check.submit();
}
</script>
<HTML>
<HEAD>
<TITLE>사용자의 아이디를 체크합니다.</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>
</HEAD>
<BODY bgcolor="#FFFFFF">
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="<%=request.getContextPath()%>/web/images/etc/u_b02.gif"></td>
    <td align=center><FONT COLOR="#FFFFFF"><b>아이디 중복 체크</FONT></td>
    <td align=right><img src="<%=request.getContextPath()%>/web/images/etc/u_b03.gif"></td>
  </tr>
</table>
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
<TR BGCOLOR=#948DCF>
  <TD>
    <TABLE CELLPADDING=4 CELLSPACING=1 BORDER=0 WIDTH=330>
  	  <form name="check"  >
  	  <TR BGCOLOR="#FFFFFF">
        <TD ALIGN="center">
        <% if(member==null){ %>
         <BR><FONT COLOR="#483cae"><b><%=id%></b></FONT>는 아직 사용되지 않은 아이디입니다.
         <BR><FONT COLOR="#483cae"><b><%=id%></b></FONT>로 등록하셔도 됩니다.
         <%}else{%>
    	<BR><br><FONT COLOR="#483cae"><b><%=id %></b></FONT>는 이미 사용 중인 아이디입니다<br>
        <font face="굴림"><b>죄송합니다</b></font><br>
    	다른 아이디를 사용하여 주십시오.
           <input name=user_id type=text size=16 maxlength=16>
      	   <input type=image src="<%=request.getContextPath()%>/web/images/etc/u_bt08.gif" border=0 vspace=0>
		<% }%>
        </TD>
      </TR>
      </form>
    </TABLE>
    		
 </TD>
</TR>
</TABLE>

<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
     <td align=left><img src="<%=request.getContextPath()%>/web/images/etc/u_b04.gif"></td>
    <td align=right><img src="<%=request.getContextPath()%>/web/images/etc/u_b05.gif"></td> 
  </tr>
  <tr>
    <td colspan=3 align=center>
      <img src="<%=request.getContextPath()%>/web/images/etc/u_bt06.gif" border=0 vspace=5 onclick="send()">
      <img src="<%=request.getContextPath()%>/web/images/etc/u_bt13.gif" border=0 vspace=5 onclick="self.close()">
    </td>
  </tr>
</table>
</BODY>
</HTML>