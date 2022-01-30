
package cpit252.lab1;

import java.time.LocalDate;
import java.util.ArrayList;

public class CPIT252Lab1 {

    
     public static void main(String[] args) {
        
       FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 
        LocalDate.parse("2022-06-07"));
    ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v"); 
        
      p5.printTotalQuantity();
       
    
   //Q4 
    Product p1= new ElectricProduct(1, 22.0, "Charger", "70");
       Product p2= new FoodProduct(2, 30.0, "Bread", LocalDate.MIN);
        
       Product[] products={p1, p2};
         
        for (Product p: products) {
            p.applySaleDiscount(20);
            System.out.println(p);
            
        }
        }
            
        }
  
