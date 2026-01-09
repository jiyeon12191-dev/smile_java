package test;

public class test1 {

	public static void main(String[] args) {
		
		int second=3726;
		int hour=0;
		int min=0;
		
		min=second/60;
		hour=min/60;
		System.out.println(hour+"시"+(min%60)+"분"+(second%60)+"초");
		
		
	}

}
