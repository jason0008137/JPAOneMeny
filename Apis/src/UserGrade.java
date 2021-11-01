
public class UserGrade {
	private String name;
	private int score;

	public UserGrade(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String toString() {
		return name + ":" + score;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof UserGrade))
			return false;
		UserGrade ug = (UserGrade) obj;
		return this.name.equals(ug.name) && this.score == ug.score;

	}
}
