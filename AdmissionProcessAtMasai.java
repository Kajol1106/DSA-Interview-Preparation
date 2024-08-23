import java.util.*;

abstract class admissionProcess{
  // write the abstract class as mentioned in the problem statement above
    abstract boolean ageLimit(int age);
    abstract boolean educationCriteria(boolean plusTwo);
    abstract boolean creditScore(int score);
    abstract boolean nationality(String citizen);
    
}

class intensiveProgram extends admissionProcess{
  // write the class as mentioned in the problem statement above
    int age;
    boolean plusTwo;
    int creditScore;
    String citizen;
    
    //constructor with credit score
    public intensiveProgram(int age, boolean plusTwo, String citizen, int creditScore) {
        this.age = age;
        this.plusTwo = plusTwo;
        this.citizen = citizen;
        this.creditScore = creditScore;
    }
    
    //constructor without credit score. By default value 750
    public intensiveProgram(int age, boolean plusTwo, String citizen) {
        this(age, plusTwo, citizen, 750);
    }
    
    //age should be above 18 and below 28
    @Override
    boolean ageLimit(int age) {
       return age>18 && age<28; 
    }
    
    //should done +2
    @Override
    boolean educationCriteria(boolean plusTwo) {
        return plusTwo;
    }
    
    //credit score should = or above 750
    @Override
    boolean creditScore(int score) {
        return score>=750;
    }
    
    //must be indian
    @Override
    boolean nationality(String citizen) {
        return "Indian".equalsIgnoreCase(citizen);
    }
    
    //all criteria matched or not
    String finalDecision() {
        if(ageLimit(age) && educationCriteria(plusTwo) && creditScore(creditScore) && nationality(citizen) ) {
            return "You are eligible for the Intensive Program";
        } else {
            return "You are not eligible for the Intensive Program";
        }
    }
    
}

class xProgram extends admissionProcess{
  // write the class as mentioned in the problem statement above
    int age;
    boolean plusTwo;
    int creditScore;
    String citizen;
    int yearsOfExperience;
    
    //constructor with credit score
    public xProgram(int age, boolean plusTwo, String citizen, int creditScore, int yearsOfExperience) {
        this.age = age;
        this.plusTwo = plusTwo;
        this.citizen = citizen;
        this.creditScore = creditScore;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    //constructor without creditscore
    public xProgram(int age, boolean plusTwo, String citizen, int yearsOfExperience) {
       this(age, plusTwo, citizen, 750, yearsOfExperience);
    }
    
    //age should be above 18 and below 35
    @Override
    boolean ageLimit(int age) {
       return age>18 && age<35; 
    }
    
    //should done +2
    @Override
    boolean educationCriteria(boolean plusTwo) {
        return plusTwo;
    }
    
    //credit score should = or above 750
    @Override
    boolean creditScore(int score) {
        return score>=750;
    }
    
    //must be indian
    @Override
    boolean nationality(String citizen) {
        return "Indian".equalsIgnoreCase(citizen) || "American".equalsIgnoreCase(citizen);
    }
    
    //all condition met or not
    String finalDecision() {
        if(ageLimit(age) && educationCriteria(plusTwo) && creditScore(creditScore) && nationality(citizen) ) {
            return "You are eligible for the X Program";
        } else {
            return "You are not eligible for the X Program";
        }
    }
    
    boolean experience() {
        return yearsOfExperience>=2;
    }
    
}


