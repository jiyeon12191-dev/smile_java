package exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _EXec2 {

	public static void main(String[] args) {
		
	 List<Integer> numbers = new ArrayList<>(); // []
	 numbers.add(50); // [50]
	 numbers.add(10); // [50,10]
	 
	 // 오름차순
	 Collections.sort(numbers);
	 System.out.println("오름차순 :" + numbers); // [10,30,50]
	 
	 
	 

	}

}
