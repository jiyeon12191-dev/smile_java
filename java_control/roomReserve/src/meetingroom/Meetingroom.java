package meetingroom;

import java.util.ArrayList;
import java.util.Scanner;

public class Meetingroom {

	private int roomNumber;
	private int id;
	private String reserverName;
	private String date;
	
	public Meetingroom(int roomNumber,int id,String reserverName,String date) {
	      this.roomNumber = roomNumber;
	      this.id=id;
	      this.reserverName = reserverName;
	      this.date = date;
	}
	      @Override
	      public String toString() {
	    	  return"회의실"+ roomNumber+"번("+ date +", 예약자: " + reserverName +")";
	   
	      }
	public Meetingroom(String date) {
		this.date = date;
	}
	      
	public int getId() {
		return id;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Meetingroom>reservation = new ArrayList<>();
		

		reservation.add(new Meetingroom("2026-01-15"));
		reservation.add(new Meetingroom("2026-01-15"));
		
		System.out.println("취소할 예약 id를 입력하세요:");
		int cancelld = scan.nextInt();
		scan.nextLine();
		
		boolean isCanclled =false;
		
		for(int i=0; i < reservation.size(); i++) {
			if(reservation.get(i).getId()==cancelld) {
				reservation.remove(i);
				isCanclled=true;
				break;
			}
			}
	    
		if(isCanclled) {
		 System.out.println("예약이 취소되었습니다");
		}else {
	      System.out.println("예약이 존재하지 않습니다");
	}
		
	}
		}
	
		
		

	


