package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDAO {
	
	
	 String dbUsr="com.mysql.cj.jbdc.Driver";
	 String dbur1="jdbc:mysql:// localhost:3306/javaExample?servertimezone=Asia/Seoul";
	 String dbusr = "javaUser";
	 String dbpwd = "1234";
	 
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 
	 private void dbClose(ResultSet rs, PreparedStatement pstmt,Connection conn) {
		try {
			if(rs != null) {rs.close();}
			if(pstmt != null) {pstmt.close();}
			if(conn != null) {conn.close();}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

public List<StudentDTO> getSelectAll() {
	List<StudentDTO> list = new ArrayList<>();
	 String dbUrl="jdbc:mysql:// localhost:3306/javaExample?servertimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";       
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			
		

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
		//----------------------------------------------
		String sql="select * from student order by hakbun desc";
         pstmt=conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while(rs.next()) {
        	StudentDTO dto = new StudentDTO();
        	dto.setHakbun(rs.getInt("hakbun"));
        	dto.setName(rs.getString("name"));
        	dto.setSsn(rs.getString("ssn"));
        	dto.setAdress(rs.getString("address"));
        	dto.setCreatedDate(rs.getDate("CreatedDate"));
        	list.add(dto);
        }  
        //----------------------------------------------
	}catch(Exception e) {
		System.out.println("드라이버 로딩 실패 또는 접속 실패..");
	}finally {
		dbClose(rs,pstmt,conn);
	}
	return list;
}
	public int setinsert(StudentDTO dto) {
		    String dbUrl="jdbc:mysql:// localhost:3306/javaExample?servertimezone=Asia/Seoul";
			String dbUsr = "javaUser";
			String dbPwd = "1234";       
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			return 0;
	}
			public StudentDTO getselectOne(StudentDAO dao) {
				StudentDTO dto = new StudentDTO();
				
				try {
				Class.forName(dbur1);	
				String dbUrl;
				String dbPwd;
				conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
				//----------------------------------------------
				String sql="select * from student where hakbun + ?";
	             pstmt.setInt(1,paramDTO.getHabun());
	             rs = pstmt.excuteQuery();
	             while(rs.next()) {
	            	 dto.setHakbun(rs.getInt*("hakbun"));
	            	 dto.setName(rs.getInt*("name"));
	            	 dto.setHakbun(rs.getInt*("hakbun"));
	            	 dto.setHakbun(rs.getInt*("hakbun"));
	             }
	           result=pstmt.executeUpdate(); // 0,1
	         //----------------------------------------------------
	           if(result ==0) {
	        	  System.out.println("등록성공.");
	          }else {
	        	  System.out.println("등록 실패.");
			}
			
			
			public int setInsert(StrudentDTO dto) {
				int result=0;
			}	
			}
			
			//예외처리 (에러 뜨지 않고 프로그램을 정상적으로 작동 시킬경우)
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");	
				conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
				//----------------------------------------------
				String sql="";
				 sql += "insert into student (hakbun,name,ssn,phone,adress,createddate)values";
	             sql += "(null,?,?,?,?, now())";
	             pstmt=conn.prepareStatement(sql);
	             pstmt.setString(1,dto.getName());
	             pstmt.setString(2,dto.getSsn());
	             pstmt.setString(3,dto.getPhone());
	             pstmt.setString(4,dto.getAdress());
	           result=pstmt.executeUpdate(); // 0,1
	         //----------------------------------------------------
	           if(result ==0) {
	        	  System.out.println("등록성공.");
	          }else {
	        	  System.out.println("등록 실패.");
	        	  
	          }
	 
			}catch(Exception e) {
				System.out.println("데이터베이스 접속 실패");
			}finally {
				dbClose(rs,pstmt,conn);
	}
			void InputField(String string) {
				// TODO Auto-generated method stub
				
			}
			return result;
			public int seDelete(Student dto) {
				int result=0;
			}
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");	
				conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
				//----------------------------------------------
				String sql="select * from student where hakbun = ?";
				 pstmt = conn.prepareStatment(sql);
	             pstmt.setInt(1,paramDTO.getHakbun());
	             result = pstmt.excuteQuery();
	            
	            
					
	
			}	
	}

}
