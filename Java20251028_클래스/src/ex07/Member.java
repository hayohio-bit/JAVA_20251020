package ex07;
public class Member {
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public static void main(String[] args) {
	
	//Member user1 = new Member();
	//user1.setName("홍길동");
	//user1.setId("hong");
	Member user1 = new Member("홍길동","hong");
	System.out.println(user1.getName());
	System.out.println(user1.getId());	
		
	}
}


