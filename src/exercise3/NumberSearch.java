package exercise3;

import java.util.Scanner;

public class NumberSearch {
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int counter = 0;

    for (int number = 100; number <= 1000; number++) {
      if (counter < 9) {
      
         if (number % 5 == 0 && number % 6 == 0) {
          System.out.print(number + " ");
          counter++;
        }   
     } else {
       if (number % 5 == 0 && number % 6 == 0) {
         System.out.println(number);
         counter = 0;
       }
     }

       
    } 

  }
}  