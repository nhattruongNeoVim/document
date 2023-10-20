/**
 * @project JdbcLab
 */

package fa.training.model;

import java.io.Serializable;

/**
 * author Duy Bach.
 * 
 * @time 11:28:42 AM
 * @date Jun 16, 2019
 */
public class Item implements Serializable {

  private static final long serialVersionUID = 1L;

  private String productName;
  private String billCode;
  private int quantity;
  private double price;

  public Item() {
    super();
  }

  public Item(String productName, String billCode, int quantity, double price) {
    super();
    this.productName = productName;
    this.billCode = billCode;
    this.quantity = quantity;
    this.price = price;
  }

  //getter and setter
  // overide toString() method

  /**
   * return the productName.
   */
  public String getProductName() {
    return productName;
  }

  /**
   * set value for productName.
   * 
   * @param productName to set productName
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * return the billCode.
   */
  public String getBillCode() {
    return billCode;
  }

  /**
   * set value for billCode.
   * 
   * @param billCode to set billCode
   */
  public void setBillCode(String billCode) {
    this.billCode = billCode;
  }

  /**
   * return the quantity.
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * set value for quantity.
   * 
   * @param quantity to set quantity
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * return the price.
   */
  public double getPrice() {
    return price;
  }

  /**
   * set value for price.
   * 
   * @param price to set price
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Item [productName=" + productName + ", billCode=" + billCode
        + ", quantity=" + quantity + ", price=" + price + "]";
  }

}
