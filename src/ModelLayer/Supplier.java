package ModelLayer;

/**
 * @author Andreas
 *
 */
public class Supplier {

	private String name;
	private String address;
	private String country;
	private String phoneno;
	private String email;
	private int id;
	
	public Supplier(String n, String a, String c, String p, String e, int i)
	{
		this.name = n;
		this.address = a;
		this.country = c;
		this.phoneno = p;
		this.email = e;
		this.id = i;
	}
	
	public Supplier(String n, String a, String c, String p, String e)
	{
		this.name = n;
		this.address = a;
		this.country = c;
		this.phoneno = p;
		this.email = e;
	}
	
	public Supplier(String n, int i)
	{
		this.name = n;
		this.id = i;
	}
	
	public Supplier(int i)
	{
		this.id = i;
	}
	
	public Supplier()
	{
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
