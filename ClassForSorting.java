import java.util.Arrays;

class sorter_class{
  // complete the class as mentioned in the problem statemenent above
    // Sort method for String arrays in lexicographic order
    void sort(String[] arr) {
        Arrays.sort(arr);
    }
    
    // Sort method for integer arrays in ascending order
    void sort(int[] arr) {
        Arrays.sort(arr);
    }
    
    // Sort method for character arrays with upper case given higher precedence
    void sort(char[] arr) {
        Arrays.sort(arr);
    }
    
    // Sorts a boolean array such that true values come first followed by false values
    void sort(boolean[] arr) {
        int trueCount = 0;
        for (boolean b : arr) {
            if (b) {
                trueCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i < trueCount;
        }
    }
}
