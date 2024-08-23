public static void solve(List<Integer> list){
    //write your code here
    //If the size of the list is even, add 10 to the end of the list, else if it is odd, add 10 at the beginning of the list
    if (list.size()%2 == 0) {
        list.add(10);
    } else {
        list.add(0, 10);
    }
        
    //If the size of the list is greater than 5, then add 3 at position 3, else add 3 at the end of the list
    if(list.size()>5) {
        list.add(3, 3);
    } else {
        list.add(3);
    }
    
    //Check if the list contains the value 5 or not. Print true, if the value is present, else print false, on a new line
    System.out.println(list.contains(5));
    
    
    //Check the number of odd elements in the list, and print it on a new line
    int oddCount = 0;
    for (int num : list) {
        if (num%2 != 0) {
            oddCount++;
        }
    }
    System.out.println(oddCount);
    
    //print the number of odd elements again
    System.out.println(oddCount);
    
    //Check the number of unique elements in the list and print the number of unique elements in new line
    Set<Integer> uniqueSet = new HashSet<>(list);
    System.out.println(uniqueSet.size());
    
    //Check the count of elements that have a frequency of more than 1 in the list
    int moreThanOneCount = 0;
        for (int num : uniqueSet) {
            int frequency = Collections.frequency(list, num);
            if (frequency > 1) {
                moreThanOneCount++;
            }
        }
    System.out.println(moreThanOneCount);
        
    //Print the first and the last element of the list
    System.out.println(list.get(0) + " " + list.get(list.size() - 1));
    
    // all the elements of the list on a single line
    for (int num : list) {
        System.out.print(num + " ");
    }
  }
