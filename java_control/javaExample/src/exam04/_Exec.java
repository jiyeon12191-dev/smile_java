package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 80);
		Student s2 = new Student("이성순", 90);
		Student s3 = new Student("장천용", 100);
		
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",80)); // [s1]
		list.add(s2); //[s1,s2]
		list.add(s3); //[s1,s2,s3]
		
		// 람다를 이용한 정렬(점수 내림차순)
		//list.sort((s1,s2)) -> s2.score - s1.score);
		
		System.out.println("성적순 정렬 결과:");
		

	}

}
