/**
 * 
 */
package ModelLayer;

/**
 * @author Jacob Pederen
 *
 */
public class Product {

	private String name;
	private double purchasePrice;
	private double salesPrice;
	private String countryOfOrigin;
	
	/**
	 * Create Product
	 * @param name	The products name
	 * @param purchasePrice	the price for which the product have been bought from supplier
	 * @param salesPrice The price to sell the product for
	 * @param countryOfOrigin	The country the product originates from.
	 */
	public Product(String name, double purchasePrice, double salesPrice, String countryOfOrigin) {
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.countryOfOrigin = countryOfOrigin;
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
	 * @return the purchasePrice
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the salesPrice
	 */
	public double getSalesPrice() {
		return salesPrice;
	}

	/**
	 * @param salesPrice the salesPrice to set
	 */
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
}
