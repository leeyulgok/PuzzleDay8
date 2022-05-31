package part9;

import java.util.Scanner;

public class AccountTester2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계좌 정보를 입력하세요.");
		System.out.print("명 의 : ");
		String name = scan.next();
		System.out.print("번 호 : ");
		String no = scan.next();
		System.out.print("잔 고 : ");
		long balance = scan.nextLong();
		System.out.print("개설 연도 : ");
		int year = scan.nextInt();
		System.out.print("개설 월 : ");
		int month = scan.nextInt();
		System.out.print("개설 일 : ");
		int date = scan.nextInt();
		
		Day d = new Day(year, month, date);
		Account member = new Account(name, no, balance, d);
		
		System.out.println("계좌 기본 정보 : " + member.toString());
		System.out.println("개설일 : " + d.toString());
		
		scan.close();
	}

}
