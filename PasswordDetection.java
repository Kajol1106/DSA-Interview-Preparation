/*
abstract class passwordDetector{
    abstract boolean checkLength(String password);
    abstract boolean checkSpecialCharacter(String password);
    abstract boolean checkNumber(String password);
    abstract boolean checkUpperCase(String password);
    abstract boolean checkLowerCase(String password);
}
*/
class checker extends passwordDetector{
    // complete the class as mentioned in the problem statement
      int size;
      
      public checker(int size) {
          this.size = size;
      }
    
      boolean checkLength(String password) {
          return password.length() >= size;
      }
      
      boolean checkSpecialCharacter(String password) {
          return password.matches(".*[@#$&*].*");
      }
      
      boolean checkNumber(String password) {
          return password.matches(".*\\d.*");
      }
      
      boolean checkUpperCase(String password) {
          return password.matches(".*[A-Z].*");
      }
      
      boolean checkLowerCase(String password) {
          return password.matches(".*[a-z].*");
      }
  }
  