package SampleEx;

class student {

	private String name;

	private final static student s =  new student("Jomama");

	private student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static student getS() {
		return s;
	}

}

public class SingletonEx {

	public static void main(String[] args) {

	}

}
