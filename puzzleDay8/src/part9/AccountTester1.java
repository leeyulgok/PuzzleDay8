package part9;

public class AccountTester1 {

	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Account gildong = new Account("길동", "123456", 100, d);
		
		Day p = gildong.getOpenday();
		System.out.println("계좌 개설일 : " + p);
		
		p.set(1999, 12, 31);
		
		Day q = gildong.getOpenday();
		System.out.println("계좌 개설일 : " + q);
	}

}
