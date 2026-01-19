package exam04;

public class Student {
	
	String name;
	int score;
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}
