// import the appropriate library function to use a HashSet 
import java.util.HashSet;

class collections_in_java{
  public HashSet<Integer> solve(int n,int[] arr){
    // complete the function as mentioned in the problem statement
    HashSet<Integer> uniqueValues = new HashSet<>();
    
    for(int value : arr) {
        uniqueValues.add(value);
    }
    
    return uniqueValues;
  }
}
