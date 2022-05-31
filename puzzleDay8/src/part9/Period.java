package part9;

public class Period {
	private Day from;
	private Day to;
	
	public Period() {
		
	}

	public Period(Day from, Day to) {
		this.from = new Day(from);
		this.to = new Day(to);
	}

	public Day getFrom() {
		return new Day(from);
	}

	public void setFrom(Day from) {
		this.from = from;
	}

	public Day getTo() {
		return new Day(to);
	}

	public void setTo(Day to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Period [from=" + from + ", to=" + to + "]";
	}
	
}
