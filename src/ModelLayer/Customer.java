/**
 * 
 */
package ModelLayer;

/**
 * @author nicklas
 *
 */
public class Customer {
	private String name; // The persons name
	private String address; // The persons address
	private String zipCode;
	private String city;
	private String phoneNumber; // THe persons phone number
	private String email;

	public Customer(String name, String address, String zipCode, String city, String phoneNumber,
			String email) {

		this.setName(name);
		this.setAddress(address);
		this.setZipCode(zipCode);
		this.setCity(city);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
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