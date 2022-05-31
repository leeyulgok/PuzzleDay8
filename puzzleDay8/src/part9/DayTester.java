package part9;

import java.util.Scanner;

public class DayTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("day1을 입력하세요.");
		System.out.print("년 : ");
		int year = scan.nextInt();
		System.out.print("월 : ");
		int month = scan.nextInt();
		System.out.print("일 : ");
		int date = scan.nextInt();
		
		Day day1 = new Day(year, month, date);
		
		System.out.println("day1 = " + day1.toString());
		System.out.println("day2를 day1과 같은 날짜로 만들었습니다.");
		Day day2 = day1;
		System.out.println("day2 = " + day2.toString());
		
		if(day1.equalTo(day2)) {
			System.out.println("day1과 day2는 같습니다.");
		} else {
			System.out.println("day1과 day2는 다릅니다.");
		}
		
		Day d1 = new Day();
		Day d2 = new Day(year);
		Day d3 = new Day(year, month);
		Day d4 = new Day(year, month, date);
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);
		
		Day[] a = new Day[3];
		for(int i = 0; i < a.length; i++) {
			a[i] = new Day();
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		scan.close();
	}

}
