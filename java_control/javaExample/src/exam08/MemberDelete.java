package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원등록 프로그램
public class MemberDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 아이디 :");
		String id = sc.nextLine();
		sc.close();
		
		
	/*	
		int a = 5;
		int b =3;
		
		try {
			double c = a / b;
			System.out.println("c : " + c);
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(b + "으로 나누어서 종료");	
		}finally {
		System.out.println("에러났네");
	*/		
		
		String dbUrl="jdbc:mysql:// localhost:3306/javaExample?servertimezone=Asia/Seoul";
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
			String sql="";
			 sql += "delete from member  where id = ?";
             pstmt=conn.prepareStatement(sql);
             pstmt.setString(1, id);
          int result=pstmt.executeUpdate(); // 0,1
          if(result ==0) {                                      
        	  System.out.println("삭제 실패-" + result);
          }else {
        	  System.out.println("삭제 성공-  " + result);
          }
			//----------------------------------------------
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패..");
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


