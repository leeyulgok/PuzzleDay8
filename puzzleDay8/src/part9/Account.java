package part9;

public class Account {
	private String name;	// 명의
	private String no;		// 번호
	private long balance;	// 잔고
	private Day openday;	// 개설일
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
		openday = new Day(d);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Day getOpenday() {
		return new Day(openday);
	}

	public void setOpenday(Day openday) {
		this.openday = openday;
	}

	public void deposit(long k) {
		balance += k;
	}
	
	public void withdraw(long k) {
		balance -= k;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", no=" + no + ", balance=" + balance + ", openday=" + openday + "]";
	}
	
}
