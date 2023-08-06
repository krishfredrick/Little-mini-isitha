import java.util.*;
public class Main {
  public static void main(String[] args) {
    /*  You need to scanner object for fetching data from the console 
     * scan is object which I choose you can name anything like anything ---> " Scanner ishita = new Scanner(System.in);"
     * Learing about "System.in" is overkill right now I love to explain later part of my task;
     */
    Scanner scan = new Scanner(System.in);
    // how to get the object from the console.
    // int number = scan.nextInt();
    // float decimal = scan.nextFloat();

    /** Q1:understanding of how to fetch data from the user in console; */
    // System.out.print("a: ");
    int a = scan.nextInt();
    // System.out.print("b");
    int b = scan.nextInt();
    int total = a+b;
    // check help.md file if you forgot how to print in vs

    System.out.println(total);
    scan.close();

  }
}