// Shark tank India Cast...


package Program_Challange;
/*WAP  to Design a Course class
 * Instance Variable: courseName, enrolledStudents.
 * static variable: maxCapcity, the maximum number of student for any course...
 * instance method: enrollStdents(String Student), unerollStudents(String Student).
 * static method: SetMaxCapcity(), Set the maximum Capcity for course...
 */
public class Course {
    static int maxCapcity=100;
    String courseName;
    int enrollmentNo;
    boolean isStudentEnroll;
    String[] enrollStudents;

    //Constracctor...
Course(String courseName){
    this.courseName = courseName;
    this.enrollmentNo = 0;
    this.enrollStudents = new String[maxCapcity]; 
}
static void SetMaxCapcity(int maxCapcity){
     Course.maxCapcity = maxCapcity;
}
void enrolledStuents(String StudentName){
    enrollStudents[enrollmentNo] = StudentName;
    enrollmentNo++;
    System.out.println(StudentName+" is added to the Show: "+courseName);
}
void unenrollStudents(String StudentName){
    enrollStudents[enrollmentNo] = StudentName;
    enrollmentNo--;
    System.out.println(StudentName+" is removed from the Show: "+courseName);
}
public static void main(String[] args) {
    Course.SetMaxCapcity(7);
    Course Student_Course_Status = new Course("Shark Tank India");
    System.out.println("\nThis is the Season 1st of the Show...\n");
    Student_Course_Status.enrolledStuents("Aman Gupta");
    Student_Course_Status.enrolledStuents("Vineeta");
    Student_Course_Status.enrolledStuents("Piyush Bansal");
    Student_Course_Status.enrolledStuents("Anupam");
    Student_Course_Status.enrolledStuents("Namita");
    Student_Course_Status.enrolledStuents("Ashneer");
    Student_Course_Status.unenrollStudents("Ashneer");
    System.out.println(Course.maxCapcity);
    System.out.print(Student_Course_Status.enrollmentNo);
    System.out.println("\nAfter the 1st Season show Cast...\n");
    Student_Course_Status.enrolledStuents("Amit Jain");
    Student_Course_Status.enrolledStuents("Ritesh");
    System.out.println(Course.maxCapcity);
    System.out.print(Student_Course_Status.enrollmentNo);
}

}
