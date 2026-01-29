package meetingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReserverDTO {
	private String name;
	private int seatNo;
	
	public void display() {
		System.out.println("예약자: " + name + ", 좌석번호:+seat");
		public int getTotal() {
			return 1;
			
		}
	}
	public static void main(String[] args) {
		List<ReserverDTO>reserverList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("선택(0:종료, 1:좌석현황,2:예약,3:취소)");
			String reserver = sc.nextLine();
			
			if(reserver.equals(("0")){
				break;
			
			}else if(reserver.equals("1")) {
				int hab = 0;
				for(int i =0; i<reserverList.size(); i++) {
					reserverList.get(i).display();
					hab += reserverList.get(i).getTotal();
					
					System.out.println("---------------");
					System.out.println("총 예약  : " + hab);
				}
			}
		}

	}
	private int getTotal() {
		return 0;
	}

}
