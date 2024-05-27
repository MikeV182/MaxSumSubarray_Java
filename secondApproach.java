/**
 * Max
 */
import java.math.*;

public class secondApproach {

  public static int maxSub(int[] arr) {
    int maxGlobal = arr[0], maxCurr = arr[0];
    for (int i = 1; i < arr.length; i++) {
      maxCurr = Math.max(arr[i], maxCurr + arr[i]);
      maxGlobal = Math.max(maxGlobal, maxCurr);
    }
    return maxGlobal;
  }

  public static void main(String[] args) {
    System.out.println(maxSub(new int[]{-2, 3, 1, -1}));  
    System.out.println(maxSub(new int[]{-2, -3, -1, -1})); //for negative values only it returns just maximum value in the array  
  }

}
