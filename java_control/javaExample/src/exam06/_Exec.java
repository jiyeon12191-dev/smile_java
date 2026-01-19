package exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학
		// 이름, 국어, 영어, 수학 총점 평균 
		
		Scanner sc = new Scanner(System.in);
		
		List<String[]>list = new ArrayList<>(); // [{"홍길동","90","80"}]
		
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
	   int tot = kor+eng+mat;
	   double avg = tot / 3.0;
	   
	// String imsi = name + ","+ kor+ ","+ eng+ ","+ mat+ ","+ tot+ ","+avg;
	   String[]strs = new String[6];
	   strs[1] = name;
	   strs[2] = kor + "";
	   strs[3] = String.valueOf(eng);
	   strs[4] = mat + "";
	   strs[5] = tot + "";
	   strs[5] = avg + "";
		
      list.add(strs);		
		
      System.out.println("list : " + list);
      
      for (int i=0; i<list.size(); i++) {
    	String[] strs1 = list.get(i);
    	System.out.printf("%s \t %s \t %s \t %s \t %s %t%s\n",list.get(i)[0],strs[1],strs[2]);
      }
      
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
		
	}

}
