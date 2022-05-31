package part9;

public class HumanTester1 {

	public static void main(String[] args) {
		
		Human gildong = new Human("길동", 170, 70, new Day(1975, 3, 12));
		Human chulsu = new Human("철수", 180, 80, new Day(1988, 5, 13));
		
		System.out.println("gildong = " + gildong);
		System.out.println("chulsu = " + chulsu);
	}

}
