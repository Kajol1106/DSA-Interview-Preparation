/*
interface stringFunctions{
  public void print(String a,String b);
  public int countVowels(String a,String b);
  public int countConsonants(String a,String b);
  public int valueOfString(String a,String b);
}
*/
// Please note that the string contains both uppercase and lowercase characters
class strClassOne implements stringFunctions{
    // implement all the function inherited by this class
    public String print(String a,String b){
        // This function prints both the strings on the same line separated by space
        return a+" "+b;
    }
    
    public int countVowels(String a,String b){
       // This function returns the length of the string having lesser number of vowels. 
      //In case both the strings, have the same number of vowels return the length of the bigger string
      int vowelsInA = countVowelsInString(a);
      int vowelsInB = countVowelsInString(b);
  
          if (vowelsInA < vowelsInB) {
              return a.length();
          } else if (vowelsInA > vowelsInB) {
              return b.length();
          } else {
              return Math.max(a.length(), b.length());
          }
    }
    
    public static int countVowelsInString(String str) {
          int count = 0;
          String vowels = "AEIOUaeiou";
          for (char c : str.toCharArray()) {
              if (vowels.indexOf(c) != -1) {
                  count++;
              }
          }
          return count;
      }
      
      public static int countConsonantsInString(String str) {
          int count = 0;
          String vowels = "AEIOUaeiou";
          for (char c : str.toCharArray()) {
              if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                  count++;
              }
          }
          return count;
      }
    
      public int countConsonants(String a,String b){
         // This function returns the length of the string having lesser number of consonants
         // In case both the strings have the same number of consonants, return the length of the bigger string
         int consonantsInA = countConsonantsInString(a);
         int consonantsInB = countConsonantsInString(b);
  
          if (consonantsInA < consonantsInB) {
              return a.length();
          } else if (consonantsInA > consonantsInB) {
              return b.length();
          } else {
              return Math.max(a.length(), b.length());
          }
      }
  }
  
  
  class strClassTwo implements stringFunctions{
    // implement all the function inherited by this class
    public String print(String a,String b){
        // This functions prints string a and string b on two different lines
        return a+"\n"+b;
    }
    
    public static int countVowelsInString(String str) {
          int count = 0;
          String vowels = "AEIOUaeiou";
          for (char c : str.toCharArray()) {
              if (vowels.indexOf(c) != -1) {
                  count++;
              }
          }
          return count;
      }
      
      public static int countConsonantsInString(String str) {
          int count = 0;
          String vowels = "AEIOUaeiou";
          for (char c : str.toCharArray()) {
              if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                  count++;
              }
          }
          return count;
      }
      
    public int countVowels(String a,String b){
         // This function returns the length of the string having more number of vowels. 
        //In case both the strings, have the same number of vowels return the length of the smaller string
        int vowelsInA = countVowelsInString(a);
        int vowelsInB = countVowelsInString(b);
  
          if (vowelsInA < vowelsInB) {
              return b.length();
          } else if (vowelsInA > vowelsInB) {
              return a.length();
          } else {
              return Math.min(a.length(), b.length());
          } 
    }
      public int countConsonants(String a,String b){
         // This function returns the length of the string having more number of consonants
         // In case both the strings have the same number of consonants, return the length of the smaller string
         int consonantsInA = countConsonantsInString(a);
         int consonantsInB = countConsonantsInString(b);
  
          if (consonantsInA < consonantsInB) {
              return b.length();
          } else if (consonantsInA > consonantsInB) {
              return a.length();
          } else {
              return Math.min(a.length(), b.length());
          }
      }
  }
  