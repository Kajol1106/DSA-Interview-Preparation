public static HashMap<Integer,Integer> createMap(int[] arr){
    // write your code here
    HashMap<Integer, Integer> frequency = new HashMap<>();
    for (int num : arr) {
        if (frequency.containsKey(num)) {
            frequency.put(num, frequency.get(num) + 1);
        } else {
            frequency.put(num, 1);
        }
    }
    return frequency;
  }
