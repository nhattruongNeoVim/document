/**
 * @project JPL.L.L201_ShopManagement
 */

package fa.training.threads;

import java.util.List;

import fa.training.entities.OnlineShop;
import fa.training.entities.Product;

public class Administrator extends Thread {

  private List<Product> listOfProducts;
  private Product product;

  public Administrator(List<Product> listOfProducts, Product product) {
    super();
    this.listOfProducts = listOfProducts;
    this.product = product;
  }

  @Override
  public void run() {
    OnlineShop onlineShop = new OnlineShop(listOfProducts, product);
    onlineShop.add();
  }
  
}
