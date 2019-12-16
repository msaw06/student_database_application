import java.util.Scanner;

public class Student {

  private String studentId;
  private String firstName;
  private String lastName;
  private int year;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int costOfCourse = 600;
  private static int id = 1000;

  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter the students first name: ");
    this.firstName = in.nextLine();

    System.out.print("Enter the students last name: ");
    this.lastName = in.nextLine();

    System.out.println("\n1 - 6th\n2 - 5th\n3 - 4th\n4 - 3rd\nEnter the students year: ");
    this.year = in.nextInt();

    setStudentId();
  }

  private void setStudentId() {
    id++;
    this.studentId = year + "" + id;
  }

  public void enroll() {
    do {
      System.out.println("Enter course to enroll (Q to quit): ");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();
      if (!course.equals("Q")) {
        courses = courses + "\n - " + course;
        tuitionBalance = tuitionBalance + costOfCourse;
      } else {
        break;
      }
    }
    while (1 != 0);
    //System.out.println("You are enrolled in: " + courses);
  }

  public void viewBalance(){
    System.out.println("Your tuition balance is: $" + tuitionBalance);
  }

  public void payTuition(){
    viewBalance();
    System.out.print("Please enter the amount you would like to pay: ");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance = tuitionBalance - payment;
    System.out.println("Thank you for your payment of $" + payment);
    viewBalance();
  }

  public void showInfo (){
    System.out.println("\nName: "+ firstName + " " + lastName);
    System.out.println("Student id: "+ studentId);
    System.out.println("Year: " + year);
    System.out.println("Courses enrolled: " + courses);
    System.out.println("Tuition balance: $" + tuitionBalance);
  }
}
