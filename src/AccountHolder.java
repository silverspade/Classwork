public class AccountHolder {
	private int SSN;
	private String name;
	private String phone;
	private String address;
	
	public AccountHolder(int SSN, String name, String phone, String address) {
		this.SSN = SSN;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public int getSSN() {
		return SSN;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setSSN(int SSN) {
		this.SSN = SSN;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}