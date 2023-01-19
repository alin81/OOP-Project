import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
  
class Statistics implements StatisticsInterface{
  // there will be an error above until the Interface has been populated
  //Two methods each
  public int Range(int[] nums){
    // Calculates the range of the array - Sterling
    Arrays.sort(nums);
    return (nums[nums.length-1] - nums[0]);
  }
  public int Median(int[] nums) { // Calculates the median of the array - Abraham
    Arrays.sort(nums);
    return nums[nums.length/2];
  } 
  public int Max(int[] nums){ // Calculates the highest number based off the range - Abraham
    return nums[nums.length-1];
  }

  public int Min(int[] nums){ // Calculates the lowest number based off the range - Sterling
    Arrays.sort(nums);
    return (nums[0]);
  }
  public double Mode (int[] nums) {  // Calculates the mode of the array - Ian
    double maxValue = -1;
    int maxCount = 0;
    int currentCount = 1;
    double currentValue = 0;
    for(int i = 0; i < nums.length; i++) {
      currentValue = nums[i];
      currentCount = 1;
      for(int j = i + 1; j < nums.length; j++) {
        if(Math.abs(nums[j] - currentValue) < currentValue) {
          currentCount++;
        }
      }// yeah
    }  // White hoody? k
    if (currentCount > maxCount) {
        maxCount = currentCount;
        maxValue = currentValue;
    } else if (currentCount == maxCount) {
        maxValue = Double.NaN;
      }
    return maxValue;
}
  public double Mean (int[] nums) {  // Calculates the mean of the array - Ryan
      
      int sum = 0;
      for (int n : nums) {
          sum += n;
      }
    double mean = ((double)sum/nums.length);
    return mean;
  }
  
}