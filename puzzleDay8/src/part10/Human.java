package part10;

public class Human {
	private static int counter = 0;
	private String name;
	private int height;
	private int weight;
	private int id;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
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

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	void gainWeight(int w) {
		weight += w; // 살이 찐다.
	}
	
	void reduceWeight(int w) {
		weight -= w; // 살이 빠진다.
	}

	public void putData() {
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height + "cm");
		System.out.println("체중 : " + weight + "kg");
	}
	
}
