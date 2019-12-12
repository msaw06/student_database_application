import java.util.Scanner;

public class Student {

  private String studentId;
  private String firstName;
  private String lastName;
  private int year;
  private String courses;
  private double tuitionBalance;
  private static int costOfCourse = 600;
  private static int id = 1000;

  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the students first name: ");
    this.firstName = in.nextLine();

    System.out.print("Enter the students last name: ");
    this.lastName = in.nextLine();

    System.out.println("\n1 - 6th\n2 - 5th\n3 - 4th\n4 - 3rd\nEnter the students year: ");
    this.year = in.nextInt();

    setStudentId();

    System.out.println(firstName + " " + lastName + " " + "\nStudent ID: " + studentId + "\nYear: " + year);


  }

  private void setStudentId() {
    id++;
   this.studentId = year + "" + id;
  }
}
