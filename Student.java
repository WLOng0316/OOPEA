package EA;

public class Student {

	public String name, gender, address;
	public int IC, age, dateOfBirth;
	public Guardian guardian1 = new Guardian();
	public Guardian guardian2 = new Guardian();
	
	public Student(String name, String gender, String address, int IC, int age, int dateOfBirth, Guardian guardian1, Guardian guardian2) {
		
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.IC = IC;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.guardian1 = guardian1;
		this.guardian2 = guardian2;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	

	public int getIC() {
		return IC;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getdateOfBirth() {
		return dateOfBirth;
	}
	
	public Guardian getGuardian1() {
		return guardian1;
	}
	
	public Guardian getGuardian2() {
		return guardian2;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void setIC(int IC) {
		this.IC = IC;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setdateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public void setGuardian1(Guardian guardian) {
		this.guardian1 = guardian1;
	}
	
	public void setGuardian2(Guardian guardian) {
		this.guardian2 = guardian2;
	}
	
	
	
}