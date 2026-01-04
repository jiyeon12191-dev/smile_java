package com.sample.java;

public class mainP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주차장에 요금이 기본요금은 1000원이다.
		// 기본시간은 30분이다. 
		// 10분 당 100원씩 추가  예) 39분은 1000원, 40분은 1100원
		// 단 4시간 이상 주차시 기본요금은 2500원이다.
		// 예) 3시간 50분 (230분) - 3000원 
		/// 4시간 12분 (252분) -> 2600원
		
		int baseTenMinute = 30; // 기본시간
		int basFee= 1000; 		// 기본요금
		int tenMinuteFee= 100; 	// 10분당 요금
		int forHourFee= 2500;	// 4시간 이상 주차 기본요금
		int parkingTime = 252; 	// 주차시간 10분 단위 - 252분
		int totalFee = 0;		// 총 주차요금
		if(parkingTime > 240) {// 주차시간이 4시간 이상인경우 
			int trueTime= (parkingTime-baseTenMinute)/10;//주차한시간 - 기본시간 /10분
			totalFee = forHourFee+(trueTime*tenMinuteFee);//4시간 기본요금+주차요금
					
		}
        System.out.println(" 총 주차요금:"+ totalFee);
	}

}
