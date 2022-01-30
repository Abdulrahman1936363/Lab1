
package cpit252.lab1;

import java.time.LocalDate;


public class FoodProduct extends Product{
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name, LocalDate expirationDate){
    super(id, price, name);
    this.expirationDate = expirationDate;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }

    @Override
    public void getSellableStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
