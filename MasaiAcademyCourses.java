/*
interface masaiAcademy{
    public boolean criteria();
    public int limit();
    public String[] courses();
    public String lead();
}
*/

class javaAcademy implements masaiAcademy{
    //write your code here
      public boolean criteria() {
          return true;
      }
      
      public int limit() {
          return 10;
      }
      
      public String[] courses() {
          String[] courses = {"JA111","SB101","SB201","RJ101"};
          return courses;
      }
      
      public String lead() {
          return "Albert";
      }
      
      public int duration() {
          return 2;
      }
      
      public String difficulty() {
          return "Moderate-High";
      }
  }
  
  class mernAcademy implements masaiAcademy{
    //write your code here
      public boolean criteria() {
          return true;
      }
      
      public int limit() {
          return 20;
      }
      
      public String[] courses() {
          String[] courses = {"JS101","WEB101","JS201","RCT101","NEM101","RM101"};
          return courses;
      }
      
      public String lead() {
          return "Albert";
      }
      
      public int duration() {
          return 6;
      }
      
      public String difficulty() {
          return "Moderate";
      }
  }
  