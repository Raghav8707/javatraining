package com.infinitee.day2;
enum Weekdays{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Enum {
	public static void main(String[] args) {
		Weekdays wd = Weekdays.TUESDAY;
		System.out.println(wd);
		String str = "FRIDAY";
		wd = Weekdays.valueOf(str);//str to enum 
		System.out.println(wd);
	}

}
