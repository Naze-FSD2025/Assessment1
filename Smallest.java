public class Smallest {
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
     
    