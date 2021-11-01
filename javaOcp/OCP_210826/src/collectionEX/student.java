package collectionEX;

public class student implements Comparable<student> {
	private String name;
	private int chi, eng, sum;

	public student() {
		super();
	}

	public student(String name, int chi, int eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		sum = chi + eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSum() {
		sum = chi + eng;
		return sum;
	}

	public void show() {
		System.out.println("名:" + getName() + "\t國文:" + getChi() + "\t英文:" + getEng() + "\t總分:" + getSum());
	}

	public int compareTo(student o) {
		return this.sum - o.sum;
	}
}
