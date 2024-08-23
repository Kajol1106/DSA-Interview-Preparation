// Write you code here and Class name should be "StudentManagementApp"
import java.util.*;

class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String phoneNumber;
    private String city;
    private String gender;

    // Constructor
    public Student(int rollNo, String firstName, String lastName, String dob, String email, String phoneNumber, String city, String gender) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.gender = gender;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }
} 


class StudentManagementApp {
    
    ArrayList<Student> students;
    
    public StudentManagementApp() {
        students = new ArrayList<>();
    }
    
    //method to add new student
    public void addStudent(Student student) {
        if(student.getRollNo()<10 || student.getRollNo()>100) {
            System.out.println("Please enter a valid roll number");
            return;
        }
        
        for(Student st : students) {
            if(st.getRollNo() == student.getRollNo()) {
                System.out.println("Student is already present in the record");
                return;
            }
        }
        
        students.add(student);
        System.out.println("Student added successfully");
    }
    
 // Method to view a student record
    public void viewStudent(int rollNo) {
        for (Student st : students) {
            if (student.getRollNo() == rollNo) {
                System.out.println("Student details");
                System.out.println("Roll No : " + st.getRollNo());
                System.out.println("First Name : " + st.getFirstName());
                System.out.println("Last Name : " + st.getLastName());
                System.out.println("Date of Birth : " + st.getDob());
                System.out.println("Email : " + st.getEmail());
                System.out.println("Phone Number : " + st.getPhoneNumber());
                System.out.println("City : " + st.getCity());
                System.out.println("Gender : " + st.getGender());
                return;
            }
        }
        System.out.println("Student is not present in the record");
    }
    
    // Method to delete a student record
    public void deleteStudent(int rollNo) {
        for (Student st : students) {
            if (st.getRollNo() == rollNo) {
                students.remove(st);
                return;
            }
        }
        System.out.println("Student is not present in the record");
    }
    
    // Method to print the total count of students
    public void totalStudents() {
        System.out.println("Total number of students: " + students.size());
    }
    
}
