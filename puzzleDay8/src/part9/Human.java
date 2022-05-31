package part9;

public class Human {
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	void gainWeight(int w) {
		weight += w; // 살이 찐다.
	}
	
	void reduceWeight(int w) {
		weight -= w; // 살이 빠진다.
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", height=" + height + ", weight=" + weight + ", birthday=" + birthday + "]";
	}
}
