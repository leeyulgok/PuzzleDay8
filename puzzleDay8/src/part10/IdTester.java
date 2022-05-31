package part10;

public class IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 식별번호 : " + a.getId());
		System.out.println("b의 식별번호 : " + b.getId());
		
		System.out.println("마지막으로 부여한 식별번호 : " + Id.getMaxId());
		
		
	}

}
