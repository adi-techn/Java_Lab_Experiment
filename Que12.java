import java.util.Scanner;
public class Que12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ids = new int[5];
        String[] names = new String[5];
        double[] salaries = new double[5];
        String[] departments = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            ids[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Enter Salary: ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Enter Department: ");
            departments[i] = scanner.nextLine();
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Salary: " + salaries[i]);
            System.out.println("Department: " + departments[i]);
            System.out.println("-----------------------");
        }
    }
}

