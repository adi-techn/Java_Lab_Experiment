import java.util.Scanner;
public class Que19{
     static String[][] bookings = new String[10][4];
     static int bookingCount = 0;
     public static void bookRoom(String date, String startTime, String endTime, String name) {
          for (int i = 0; i < bookingCount; i++) {
               if (bookings[i][0].equals(date) && bookings[i][1].equals(startTime) && bookings[i][2].equals(endTime)) {
                    System.out.println("Sorry, the room is already booked by " + bookings[i][3]);
                    return;
               }
          }
          if (bookingCount < bookings.length) {
               bookings[bookingCount][0] = date;
               bookings[bookingCount][1] = startTime;
               bookings[bookingCount][2] = endTime;
               bookings[bookingCount][3] = name;
               bookingCount++;
               System.out.println("Room successfully booked for " + name);
          } else {
               System.out.println("No more bookings can be made!");
          }
     }
     public static void checkAvailability(String date, String startTime, String endTime) {
          for (int i = 0; i < bookingCount; i++) {
               if (bookings[i][0].equals(date) && bookings[i][1].equals(startTime) && bookings[i][2].equals(endTime)) {
                    System.out.println("Room is already booked by " + bookings[i][3]);
                    return;
               }
          }
          System.out.println("Room is available!");
     }
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int choice;
     do {
          System.out.println("\nConference Room Booking System:");
          System.out.println("1. Book a Room");
          System.out.println("2. Check Availability");
          System.out.println("3. Exit");
          System.out.print("Enter your choice: ");
          choice = scanner.nextInt();
          scanner.nextLine(); 
          switch (choice) {
          case 1:
               System.out.print("Enter Date (YYYY-MM-DD): ");
               String date = scanner.nextLine();
               System.out.print("Enter Start Time (HH:MM): ");
               String startTime = scanner.nextLine();
               System.out.print("Enter End Time (HH:MM): ");
               String endTime = scanner.nextLine();
               System.out.print("Enter Your Name: ");
               String name = scanner.nextLine();
               bookRoom(date, startTime, endTime, name);
               break;
          case 2:
               System.out.print("Enter Date (YYYY-MM-DD): ");
               date = scanner.nextLine();
               System.out.print("Enter Start Time (HH:MM): ");
               startTime = scanner.nextLine();
               System.out.print("Enter End Time (HH:MM): ");
               endTime = scanner.nextLine();
               checkAvailability(date, startTime, endTime);
               break;
          case 3:
               System.out.println("Exiting the system. Have a great day!");
               break;
          default:
               System.out.println("Invalid choice. Please try again.");
          }
     }while (choice != 3);
     scanner.close();
     }
}