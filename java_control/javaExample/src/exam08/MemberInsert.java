package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원등록 프로그램
public class MemberInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 :");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 :");
		String password = sc.nextLine();
		
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("전화번호 :");
		String phone = sc.nextLine();
		
		
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
			 sql += "insert into member (no,id,password,name.,phone,createDate)valuse";
             sql += "(null,?,?,?,?, now())";
             pstmt=conn.prepareStatement(sql);
             pstmt.setString(1, id);
             pstmt.setString(2, password);
             pstmt.setString(3, name);
             pstmt.setString(4, phone);
          int result=pstmt.executeUpdate(); // 0,1
          if(result ==0) {
        	  System.out.println("등록성공.");
          }else {
        	  System.out.println("등록 실패.");
        	  
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


