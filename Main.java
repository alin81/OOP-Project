// Mean, median, mode, range classes
// Asks which statistic they would like to calculate first
// Loops at the end to redo the program. Exit function to finish the program

//Atribute names:
// 

import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int length; 
    
    Statistics stats = new Statistics();
    System.out.println("Welcome to our statistics program!");

    while true {
    System.out.print("Enter the amount of numbers you want to store: ");
    length=Integer.parseInt(keyboard.next());   
    int[] nums = new int[length];
    
    for(int i=0; i<length; i++)  {  
      System.out.println("Enter a number: ");
      nums[i]=keyboard.nextInt();  
    }  
    System.out.println("Array elements are: ");  
    for (int i=0; i<length; i++) {  
      System.out.println(nums[i]);  
    } 
    
    System.out.println("Choose a statistic to print! \n 1: Median \n 2: Mode \n 3: Mean \n 4: Range \n 5: Minimum \n 6: Maximum");
    int choice = keyboard.nextInt(); // Depending on this, we will choose which statistic will be calculated
  while (1 ==1 ) {
    switch(choice) {
      case 1:
        System.out.println("The median is " + stats.Median(nums));
        break;
      case 2:
        System.out.println("The mode is " + stats.Mode(nums));
        break;
      case 3:
        System.out.println("The mean is " + stats.Mean(nums));
        break;
      case 4:
        System.out.println("The range is " + stats.Range(nums));
        break;
      case 5:
        System.out.println("The max number is " + stats.Max(nums));
        break;
      case 6:
        System.out.println("The minimum number is " + stats.Min(nums));
      default:
        System.out.println("Invalid input");    
    }
  }
}
  }
}
    