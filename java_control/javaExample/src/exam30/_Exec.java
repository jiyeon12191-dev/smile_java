package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("선택(1.목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료):");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				StudentDAO dao = new StudentDAO();
				List<StudentDTO> list = dao.getSelectAll();
				System.out.println("gkrqjs \t 이름 \t 주민번호 \t 연락처\t 주소 \t 등록일");
				for(int i=0; i<list.size(); i++) {
					list.get(i).display();
				}
				break;
			case "2":
				dao.inputField("view");
				StudentDTO resultDTO = dao.getselectOne(dao);
				resultDTO.display();
				break;
			case "3":
				dao.inputField("chuga");
				//StudentDAO dao= new StudentDAO();
				 result = dao.setInsert(dao);
				System.out.println("result : " + result);
				break;
				//DB작업
				
				String name = "이성순";
				String ssn = "123456-1234567";
				String phone = "010-2222-3333";
			    String address = "서울";
				Map <String,String> map = new HashMap<>();
				map.put("name",name);
				map.put("ssn",ssn);
				map.put("phone",phone);
				map.put("adress",address);
				
			//	StudentDTO dto= new StudentDTO();
				StudentDAO dao= new StudentDAO();
				 result = dao.setInsert(dao);
				System.out.println("result : " + result);
				break;
			case "4":
				System.setOut(null);
				break;
			case "5":
			dto.inputField("- 삭제 -");
			 result = dao.setDdelete(dto);				
				break;	
			default:
				System.out.println("- 프로그램 종료 -");
				break;
			}
		}
	}
	}


