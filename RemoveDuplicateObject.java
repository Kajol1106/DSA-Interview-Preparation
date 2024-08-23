// Write you code here and Class name should be "StudentMarksComparator"
import java.util.Objects;


class Student {
    int roll;
    String name;
    int marks;
    
    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    
    public int getRoll() {
        return roll;
    }
    
    public void setRoll(int roll) {
        this.roll = roll;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMarks() {
        return marks;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
     // Overriding hashCode
    @Override
    public int hashCode() {
        return Objects.hash(roll, name, marks);
    }
    
    // Overriding equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Student student = (Student) obj;
        
        return roll == student.roll &&
               marks == student.marks &&
               Objects.equals(name, student.name);
    }
}
