// package Basic-templates.java.util.01-Introduction-to-java.03-creating-1st-function;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    /* Creating Array */
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the Size of the Array");
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    printArray(arr);
    scan.close();
  }

  public static void printArray(int[] arr){
    // Default way of iterating the task
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }

    // Improvised For loop it get the value from iterator
    for(int val: arr){
      System.out.print(val+" ");
    }
  }
}
