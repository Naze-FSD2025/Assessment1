public class Discount {

      public static void main(String[] args) {
          double amount = 800;
          double discount = 0;
          if (amount < 500)
          {
              discount = 0;
          }
          else if (amount <= 1000)
          {
              discount = amount * 0.10;
          }
          else{
              discount = amount * 0.20;
          }
          double finalAmount = amount - discount;
          System.out.println("Discount Applied = " + discount);
          System.out.println("Final Payable Amount = " + finalAmount);
      }
  }
    
