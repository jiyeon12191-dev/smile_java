package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	List<ProductDTO>productList = new ArrayList<>();
//	list.add("0:종료");
//	System.out.println("list : " + list);
//	list.add("1:목록");
//	System.out.println("list : " + list);
//	list.add("2:등록");
//	System.out.println("list : " + list);
//	list.add("3:수정");
//	System.out.println("list : " + list);
//	list.add("4:삭제");
//	System.out.println("list : " + list);
	Scanner sc = new Scanner(System.in);
	while(true) {
   System.out.println("선택(0:종료, 1:목록, 2:등록,3:수정, 4:삭제)");
   String user = sc.nextLine();
   if(user.equals("0")) {
	   break;
   }else if(user.equals("1")) {
	   int hab = 0;
	  for(int i =0; i <productList.size(); i++) {
		  productList.get(i).display();
		  hab += productList.get(i).getTotal();
	  }
	  System.out.println("----------------");
	  System.out.println("합계 : " + hab);
	  
   } else if(user.equals("2")) {
	    System.out.println("상품이름: ");
	    String productName = sc.nextLine();
	    System.out.println("상품가격:");
	    String productPrice_ = sc.nextLine();
	    int productPrice = Integer.parseInt(productPrice_);
	    System.out.print("구매 수량: ");
	    String buycounter_ = sc.nextLine();
	    int buyCounter = Integer.parseInt(buycounter_);
	    int total = productPrice * buyCounter;
	    
	    ProductDTO dto = new ProductDTO(productName, productPrice,buyCounter);
	    		productList.add(dto);	
   }else if (user.equals("3")) {
	   System.out.println("-수정-");
   }else if(user.equals("4"))
	   System.out.println("-삭제-");
	   
	    
	   }
   }
   }
	
	

