package net.syntax.part04;

public class MemberVO {
	private String id;
	private String pwd; //ÆÐ½º¿öµå
	private String name;
	private String age;
	private String gender;
	// getter setter ´ÜÃàÅ°
	// alt + shift + s
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
