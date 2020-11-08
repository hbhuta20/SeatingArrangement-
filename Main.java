import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] seatNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };// Defined seat numbers.
    String[] studentNames = new String[15]; // Defined an array for student names.
    Scanner sc = new Scanner(System.in); 
    //Read student names in from scanner and save to array.
    System.out.println("Please enter 15 students names:");
    for(int x=0; x < 15; x++)
    {
      String name = sc.nextLine();
      studentNames[x]= name; 
    }
    int i = 0;// Print out students names and seat numbers.
    System.out.println("Here are the seating arrangment:");
    while(i<15) {
      System.out.println(studentNames[i] + " sits in seat # " + seatNumbers[i] ); // Printing data from both arrays 
      i++;//incrementing counter 
    }
    System.out.println("Good luck handling the students!!");
    System.out.println("Have a Great Day :)")
  }
}