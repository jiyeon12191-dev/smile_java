package item;

import java.sql.*;
public class DBConnect {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		connect();
	}
	
	private void connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="haha";
			String password="2368";
			String url= "jdbc:mysql://localhost:3306/haha";
			conn = DriverManager.getConnection(url,username,password);
			
		}catch(Exception e) {
			System.out.println("접속 실패");
		}	
	}
	
	public Item[] findAll() {
		Item[] items = new Item[10];
		
		
		String sql = "select * from item";
		
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			
			int i=0;
			while(rs.next()) {
				Item data = new  Item(
						rs.getNString("item_name"), rs.getInt("item_price"),
						rs.getString("item_main_image"), rs.getInt("item_stock")
						);
				items[i] = data;
				i++;
			}
		}catch (Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");
		}
		return items;
		
	
	
	}
	
	
	

	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

