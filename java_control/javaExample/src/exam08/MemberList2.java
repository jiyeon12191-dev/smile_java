package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList2 {

	public static void main(String[] args) {
		
		List<MemberDTO> list = new ArrayList<>();
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
			    MemberDTO memberDTO = new MemberDTO();
				memberDTO.setNo(rs.getInt("no"));
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPassword(rs.getString("password"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
				memberDTO.setCreatedDate(rs.getDate("createDate"));
				
				list.add(memberDTO);
				
			
 
			//----------------------------------------------
	
			}}catch(Exception e) {
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
			
		for(int i=0; i<list.size(); i++) {
			MemberDTO dto = list.get(i);	
			System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \t \n",dto.getNo(),dto.getId(),dto.getPassword(),dto.getName(),dto.getPhone(),dto.getCreatedDate());
		}
		
		System.out.println("-- 프로그램 종료 --");
		
	}

	}


