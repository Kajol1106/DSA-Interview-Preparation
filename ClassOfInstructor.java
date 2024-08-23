class instructor_details{
    // complete the class as mentioned in the problem statement
    String name;
    int age;
    String course_name;
    String coding_language;
    
    public instructor_details(String name, int age, String course_name, String coding_language) {
          this.name = name;
          this.age = age;
          this.course_name = course_name;
          this.coding_language = coding_language;
    }
    
    void name() {
        System.out.println(name);
    }
    
    void age() {
        System.out.println(name+" "+age);
    }
    
    void courseName() {
        System.out.println(name+" "+course_name);
    }
    
    void codingLanguage() {
        System.out.println(name+" "+coding_language);
    }
  }
  