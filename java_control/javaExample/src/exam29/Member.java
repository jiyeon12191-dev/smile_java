package exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		List<Memberinfo>list= new ArrayList<>();
		
		while(true) {
		String user=Scanner.nextLine();
		System.out.println("회원 관리");
		System.out.println();
		if(user.equals("0")) {
			break;
			
		}else if(user.equals("1")) {
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i).getId());
			}
		}else if(user.equals("2")) {
			
		}else if(user.equals("3")) {
			
		}else if(user.equals("4")) {
			
		}else if(user.equals("5")) {
			
		}else
			System.out.println("잘못된 정보입니다");
		

		
		
		
		
		
		
		
		}
		
	}

}
