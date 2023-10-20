/**
 * @project JdbcLab
 */

package fa.training.model;

import java.io.Serializable;

/**
 * author Duy Bach.
 * 
 * @time 11:28:12 AM
 * @date Jun 16, 2019
 */
public class Bill implements Serializable {

  private static final long serialVersionUID = 1L;

  private String billCode;
  private String customerName;
  private String createdDate;
  private float discount;
  private double totalPrice;

  public Bill() {
    super();
  }

  public Bill(String billCode, String customerName, String createdDate,
      float discount, double totalPrice) {
    super();
    this.billCode = billCode;
    this.customerName = customerName;
    this.createdDate = createdDate;
    this.discount = discount;
    this.totalPrice = totalPrice;
  }

  // getter and setter
  // overide toString() method

  
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
   * return the customerName.
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * set value for customerName.
   * 
   * @param customerName to set customerName
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * return the createdDate.
   */
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * set value for createdDate.
   * 
   * @param createdDate to set createdDate
   */
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * return the discount.
   */
  public float getDiscount() {
    return discount;
  }

  /**
   * set value for discount.
   * 
   * @param discount to set discount
   */
  public void setDiscount(float discount) {
    this.discount = discount;
  }

  /**
   * return the totalPrice.
   */
  public double getTotalPrice() {
    return totalPrice;
  }

  /**
   * set value for totalPrice.
   * 
   * @param totalPrice to set totalPrice
   */
  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Bill [billCode=" + billCode + ", customerName=" + customerName
        + ", createdDate=" + createdDate + ", discount=" + discount
        + ", totalPrice=" + totalPrice + "]";
  }

}
