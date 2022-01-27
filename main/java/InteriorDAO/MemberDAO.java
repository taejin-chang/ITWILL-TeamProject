package InteriorDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import InteriorDTO.MemberDTO;
import Util.JdbcDAO;

public class MemberDAO extends JdbcDAO {
	private static MemberDAO _dao;
	 
	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new MemberDAO();
	}
	
	public static MemberDAO getDAO() {
		return _dao;
	}
	
	//회원정보를 전달받아 MEMBER 테이블에 삽입하여 저장하고 삽입행의 갯수를 반환하는 메소드
	public int insertMember(MemberDTO member) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
					
			String sql="insert into member values(?,?,?,?,?,?,?,?,1,null)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, member.getM_userid());
			pstmt.setString(2, member.getM_passwd());
			pstmt.setString(3, member.getM_zipcode());
			pstmt.setString(4, member.getM_add1());
			pstmt.setString(5, member.getM_add2());
			pstmt.setString(6, member.getM_tel());
			pstmt.setString(7, member.getM_email());
			pstmt.setString(8, member.getM_name());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]insertMember 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	public MemberDTO selectIdMember(String id) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberDTO member=null;
		try {
			con=getConnection();
			String sql="select * from member where m_userid=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				member=new MemberDTO();
				member.setM_userid(rs.getString("m_userid"));
				member.setM_passwd(rs.getString("m_passwd"));
				member.setM_zipcode(rs.getString("m_zipcode"));
				member.setM_add1(rs.getString("m_add1"));
				member.setM_add2(rs.getString("m_add2"));
				member.setM_tel(rs.getString("m_tel"));
				member.setM_email(rs.getString("m_email"));
				member.setM_name(rs.getString("m_name"));
				member.setM_grade(rs.getInt("m_grade"));
				member.setM_last_login(rs.getString("m_last_login"));
				
				
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectIdMember 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return member;
	}
	
	public int loginMember(String id,String pass) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		int row = 0;
	 
		String query="select m_userid, m_passwd from member where m_userid=? and m_passwd=?";
		try {
			con=getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs=pstmt.executeQuery();

			
			if(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setM_userid(rs.getString("m_userid"));
				dto.setM_passwd(rs.getString("m_passwd"));
				row = pstmt.executeUpdate();
			}
		}catch (Exception e) {
			System.out.println("[에러]loginMember 메소드의 SQL 오류 = "+e.getMessage());
		}finally {
			close(con, pstmt, rs);
		}
		return row;
	
	}
}
