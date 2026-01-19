package exam03;

import java.util.ArrayList;

public class _Exec {

	public static void main(String[] args) {
		// 리스트 : 큰가방..
		ArrayList<Integer> list = new ArrayList<>(); // 리스트생성,Generric
		System.out.println("list : " + list); // [] 출력됨
 
		list.add(1);
		System.out.println("list : " + list); // [1]
		
		list.add(2);
		System.out.println("list : " + list); // [1,2]
		
		System.out.println("리스트의 길이 : " + list.size() ); 
		
		for(int i=0; i<list.size(); i++) {
		System.out.println("리스트의" + i + "번째 인덱스의 값 : " + list.get(i) ); 
		
			System.out.println("리스트의"+ i + "번째 인덱스의 값 :" + list.get(i));
			
			System.out.println("---------");
		}
		
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			System.out.println("리스트의" + i + "번째 인덱스의 값 : " + list.get(i) ); 
		
			/// 공통모듈
		
		for (Integer a : list) { // [100,2]
			System.out.println("리스트의" + i + "번째 인덱스의 값 : " + list.get(i) ); 
		i++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
	}

}
