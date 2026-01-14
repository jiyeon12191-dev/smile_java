package study20260112;

public class MainMethod {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name="이순신";
		student.age = "34";
		//student.tall = 175;    - private 접근제어자
		System.out.println( student.toString() );
		
		 Student student2 = new Student ("김유신","45",172);
		 System.out.println( student2);
		
		 BingoGame bingogame = new BingoGame();
		 System.out.println(bingogame);
		 
		 
		 bingogame.setName("김춘추");
		 System.out.println( bingogame.getName());
		 
	}

}
