import java.util.Scanner;

public class Student {

  private int studentId;
  private String firstName;
  private String lastName;
  private int year;
  private String courses;
  private double tuitionBalance;
  private double costOfCourse = 600;

  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the students first name: ");
    this.firstName = in.nextLine();

    System.out.println("\nEnter the students last name: ");
    this.lastName = in.nextLine();

    System.out.println("\n1 - 6th\n2 - 5th\n3 - 4th\n4 - 3rd\nEnter the students year: ");
    this.year = in.nextInt();

    System.out.println(firstName + " " + lastName + ": " + "\nYear: " + year);
  }
}
