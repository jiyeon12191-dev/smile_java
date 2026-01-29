package meetingroom;

import java.util.Scanner;

public class MeetingroomDTO {

	
		private int id;
		private String reservername;
		private String reservernum;
		private String reservetime;
		private String createdDate;
		private String date;
	
		public MeetingroomDTO() {
			inputField();
		}
		public void inputField() {
			Scanner sc = new Scanner(System.in);
			System.out.print("예약자 : ");
			this.reservername = sc.nextLine();
			System.out.print("예약번호: ");
			this.reservernum = sc.nextLine();
			System.out.print("예약시간: ");
			this.reservetime = sc.nextLine();
			System.out.print("예약날짜");
			this.date = sc.nextLine();
		
	
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getReservername() {
			return reservername;
		}
		public void setReservername(String reservername) {
			this.reservername = reservername;
		}
		public String getReservernum() {
			return reservernum;
		}
		public void setReservernum(String reservernum) {
			this.reservernum = reservernum;
		}
		public String getReservetime() {
			return reservetime;
		}
		public void setReservetime(String reservetime) {
			this.reservetime = reservetime;
		}
		public int getDate() {
			return getDate();
		}
		public void setDate(String date) {
			this.date = date;
		}	
}
