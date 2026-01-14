package item;

public class Main {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		Item[] items = connect.findAll();
		
		System.out.println(items[2]);
		
		

	}

}
