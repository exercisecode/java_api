package demo.jdk.entity;

public class Person {
	
	private long id;
	
	private String realName;
	
	private int score;
	
	private String group;
	
	public Person(){
		
	}
	
	public Person(long id, String realName, int score, String group){
		this.id = id;
		this.realName = realName;
		this.score = score;
		this.group = group;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", realName=" + realName + ", score=" + score + ", group=" + group + "]";
	}
	
	

}
