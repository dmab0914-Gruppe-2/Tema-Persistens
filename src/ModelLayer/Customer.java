/**
 * 
 */
package ModelLayer;

/**
 * @author Ronnie
 *
 */
public class Customer {
	private int CustomerID; // The CustomerID primary key from DB
	private String name; // The persons name
	private String address; // The persons address
	private int zipCode;
	private String city;
	private String phoneNumber; // THe persons phone number
	private String email;

	public Customer(int cusID, String name, String address, int zipCode,
			String city, String phoneNumber, String email) {
		this.setCustomerID(cusID);
		this.setName(name);
		this.setAddress(address);
		this.setZipCode(zipCode);
		this.setCity(city);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
	}

	public Customer() {
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int cusID) {
		this.CustomerID = cusID;
	}
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
