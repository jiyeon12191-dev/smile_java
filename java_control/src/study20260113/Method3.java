package study20260113;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		a[0] = 20;
//		a[2] = 50;
//		User[] users = new User[5]; 
//		
//		//User클래스 객체생성 
//		users[0] = new User("lee","1234","이순신","01011112222");
//		
//		users[0].setName("이순신");
//		 
//		 System.out.println( users[0].getName());

		
		
		User[] users = {
				new User("lee","1234","이순신","01011112222"),
				new User("kim","4321","김유신","010233242"),
				new User("sky","129334","한석봉","01088334567"),
				new User("gold","8472","문익점","05458612"),
				new User("gredk","12345","정약용","")
				
		};
		
		UserService us = new UserService();
//		us.findId(users);
//		
//		us.findPassword(users);
//		System.out.println(Arrays.toString(users));
		
		us.login(users);
		
		
		
	}

}
