//Program to print 10 to 50 Numbers
public class Print {
     public static void main(String[] args) {
        
      for (int i= 10; i<=50; i++)
       {
        System.out.println("Print the numbers b/w 10 to 20: " + i);
       }
}
}
 // Reverse number
 public class Print {
  public static void main(String[] args) {
         int num = 876;
         int reverse = 0;
         while (num != 0)
         {
             int digit = num % 10;
             reverse = reverse * 10 + digit;
             num = num/10;
         }
         System.out.println("The Reverse Number is: " + reverse);
     }
 }
     // Smallest Number
      public class Print {
      public static void main(String[] args) {
         int num1 = 10;
           System.out.println("Number 1 is " + num1);
           int num2 = 40;
           System.out.println("Number 2 is " + num2);
           int num3 = 5;
          System.out.println("Number 3 is " + num3);
              int smallest;
           if (num1 <= num2 && num1 <= num3)
           {
               smallest = num1;
           }
           else if (num2 <= num1 && num2 <= num3)
           {
               smallest = num2;
           }
           else
           {
               smallest = num3;
           }
           System.out.println("The Smallest Number is: " + smallest);
      }
      }
     

//      //Positive or Negative
      public class Print {
        public static void main(String[] args) {
         int i = 123;
        
         if (i > 0){
          System.out.println("Positive Number:" + i);
     }
      else if (i < 0)
      {
          System.out.println("Negative Number:" + i);
      }
      else 
      {
          System.out.println("The Number is Zero:" + i);
      }
  }
}
//  // Discount
  public class Print {
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
    
//  // Pattern
 public class Print {
   public static void main(String[] args) {
         int k = 5;
         for(int i=1; i<=k; i++){
             for(int j=1; j<=k; j++){
                 if(j<=i){
                     System.out.print((k - j + 1) + " ");
                     }
                     else {
                         System.out.print((k - i + 1) + " ");
                     }
             }
         System.out.println();
     }
 }
 }