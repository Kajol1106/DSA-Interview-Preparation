// Write you code here and Class name should be "StudentMarksComparator"
import java.util.Objects;
import java.util.Comparator;


class Student {
    int roll;
    String name;
    int marks;
    
    public Student() {}
    
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
    
    
}

class StudentMarksNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int marksCompare = Integer.compare(s1.getMarks(), s2.getMarks());
        
        if(marksCompare != 0) {
            return marksCompare;
        }
        
        return s1.getName().compareTo(s2.getName());
    }
}