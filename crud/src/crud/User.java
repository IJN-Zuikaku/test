package crud;

public class User {

	private String Roberto = "";
	private int x = 0;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int x) {
		super();
		this.Roberto = name;
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getName() {
		return Roberto;
	}

	public void setName(String name) {
		this.Roberto = name;
	}

}
