package EA;

public class Guardian {
	
	public String name, relationship;
	public int IC, contactNum;
	
	public Guardian(String name, String relationship, int IC, int contactNum) {
		
		this.name = name;
		this.relationship = relationship;
		this.IC = IC;
		this.contactNum = contactNum;

		
	}
	
	public Guardian() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public String getRelationship() {
		return relationship;
	}
	
	
	
	public int getIC() {
		return IC;
	}
	
	public int getContactNum() {
		return contactNum;
	}
	

	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	

	
	
	public void setIC(int IC) {
		this.IC = IC;
	}
	
	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
	


}
