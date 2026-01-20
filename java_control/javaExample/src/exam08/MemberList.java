package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {

	public static void main(String[] args) {
		
		String dbUrl="jdbc:mysql:// localhost:3306/javaExample?severTimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";       
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//예외처리 (에러 뜨지 않고 프로그램을 정상적으로 작동 시킬경우)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//----------------------------------------------          
			String sql = "select * from member order by no desc";
			 pstmt=conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date createDate = rs.getDate("createDate");
				System.out.printf("%s \t %s \t %s \t %s \t %s \n",no,id,name,phone, createDate);
				
			}
 
			//----------------------------------------------
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패");
		}finally {
			try {
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(conn != null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		System.out.println("-- 프로그램 종료 --");
		}
		

	}


