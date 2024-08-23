// import TreeMap from the respective library
import java.util.TreeMap;
import java.util.*;

class collection_in_java{
  public TreeMap<Character,Integer> solve(int n, String str){
    // write your code here
    TreeMap<Character,Integer> chars = new TreeMap<>();
    
    for(char c : str.toCharArray()) {
        chars.put(c, chars.getOrDefault(c, 0)+1);
    }
    
    return chars;
  }
}
