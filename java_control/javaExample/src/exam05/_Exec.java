package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class _Exec {

	private static String gender1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 이름,주민번호,나이,성별
		System.out.printf("이름 : ");
		String name = scanner.nextLine();

		String name1 = "홍길동";
		String ssn = "123456-1234567";
		String imsi = ssn.substring(7,8);
		System.out.println();
		
		String gender = "여자";
		if(imsi.endsWith("1") || imsi.equals("3")){
			 gender1 = "남자";
			
			 System.out.println("gender : " + gender);
			 
			String temp;
		//	System.out.println("temp :" + temp);
			
			String temp1 = ssn.substring(0,2);
			
			int birthYear;
			if(imsi.endsWith("1") || imsi.equals("2")){ //1900
				 birthYear = 1900 + Integer.parseInt(temp1);
			}else { //2000
				 birthYear = 2000 + Integer.parseInt(temp1);
			System.out.println("birthYear:" + birthYear);
			
		int age =2026 - birthYear;
		System.out.println("age :" + age);
		
		// 현재 날짜 정보 가져오기
		int year = LocalDate.now().getYear();
		int age1 = year - birthYear;
		
		System.out.printf("이름 : %s\n", name1 );
		System.out.printf("주민번호 : %s\n", ssn );
		System.out.printf("나이 : %s\n", age );
		
		

	}
	}
}
}