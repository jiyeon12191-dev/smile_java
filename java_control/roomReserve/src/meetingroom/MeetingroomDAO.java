package meetingroom;

import java.util.Map;

public class MeetingroomDAO {
	public int setInsert(String id,String reservername,String reservernum,String reservetime,String createDate) {
		System.out.println("-- setInsert()--");
		return 1;
	}

	public int setInsert(Map<String, String>map) {
		System.out.println("setInsert");
		System.out.println("ID from Map: " + map.get("id"));
		return 1;
	}
	
	
}
 