package exam07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학
		// 이름, 국어, 영어, 수학 총점 평균 
		
		Scanner sc = new Scanner(System.in);
		
		List<Student>list = new ArrayList<>(); // [{"홍길동","90","80"}]
		
		while(true) {
		//for(int i=0; i<3; i++)
		System.out.println("이름 : ");
		String name = sc.nextLine();
		//if(name.toLowerCase().equals("q")) {
		if(name.toUpperCase().equals("Q")) {
			
			break;
		}
		
		System.out.println("국어 : ");
		String kor_ = sc.nextLine();
		
		System.out.println("영어 : ");
		String eng_ = sc.nextLine();
		
		System.out.println("수학 : ");
		String mat_ = sc.nextLine();
		
	   int kor	= Integer.parseInt(kor_);
	   int eng	= Integer.parseInt(eng_);
	   int mat	= Integer.parseInt(mat_);
	   
	 
	   Student student1 = new Student(name,kor,eng,mat);
	   student1.setName(name);
	   student1.setKor(kor);
	   student1.setEng(eng);
	   student1.setMat(mat);
	  
	   
	   list.add(student1);
	   
	   for (int i=0; i<list.size(); i++) {
		   Student s = list.get(i);
		//   System.out.printf("%s\t%s\t%s\t%s\t%s\t",s.getName(),s.getKor(),s.getEng(),s.getMat(),s.getTot(),s.getAvg());
		   list.get(i).display();
	   }
	   
	   
	// String imsi = name + ","+ kor+ ","+ eng+ ","+ mat+ ","+ tot+ ","+avg;
	 
      
      
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
		
	}

}
