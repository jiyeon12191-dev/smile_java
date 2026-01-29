package exam30;

import java.sql.Date;
import java.util.Scanner;

public class StudentDTO {
       private int hakbun; 
	   private String name; 
	   private String ssn; 
	   private String phone; 
	   private String adress; 
	   private String createdDate;
	   private String hakbun_;
	   
	   
	   public StudentDTO() {
		
		
	}
	   // method
	   public void inputField() {
		   Scanner sc = new Scanner(System.in);
		  
		   if (gubun.equals("view") || gubun.equals("sujung")|| gubun.equals("sakje")) {
			   System.out.print(" 학번 : ");
			  String.hakbun = sc.nextLine();  
			  this.hakbun = Integer.parseInt(hakbun_);
		   }else if(gubun.equals("chuga")){
		   System.out.println("이름 : ");
		   this.name = sc.nextLine();
		   System.out.println("주민번호 : ");
		   this.ssn = sc.nextLine();
		   System.out.println("전화번호 : ");
		   this.phone = sc.nextLine();
		   System.out.println("주소 : ");
		   this.adress = sc.nextLine();
		   else if ("sujung")){
			   System.out.println("전화번호 : ");
		   }
		   
	   }
	   public void display() {
		   System.out.printf("%d \t %s \t %s \t,%s \t %s,\t %s\n",hakbun, name, ssn, phone, adress, createdDate");
	   }
	  
	   public int getHakbun() {
		   return hakbun;
	   }
	   public void setHakbun(int hakbun) {
		   this.hakbun = hakbun;
	   }
	   public String getName() {
		   return name;
	   }
	   public void setName(String name) {
		   this.name = name;
	   }
	   public String getSsn() {
		   return ssn;
	   }
	   public void setSsn(String ssn) {
		   this.ssn = ssn;
	   }
	   public String getPhone() {
		   return phone;
	   }
	   public void setPhone(String phone) {
		   this.phone = phone;
	   }
	   public String getAdress() {
		   return adress;
	   }
	   public void setAdress(String adress) {
		   this.adress = adress;
	   }
	   public String getCreatedDate() {
		   return createdDate;
	   }
	   public void setCreatedDate(Date Date) {
		   this.createdDate = Date;
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
}
