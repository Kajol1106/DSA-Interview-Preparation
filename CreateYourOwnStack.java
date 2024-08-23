class stack{
    // complete the class as mentioned in the problem statement
      private int top;
      private int size;
      private int[] arr;
      
      public stack(int size) {
          this.size = size;
          this.arr = new int[size];
          this.top = -1;
      }
      
      // Push method to insert value into the stack
      public boolean push(int data) {
          if (top >= size - 1) {
              return false;
          }
          arr[++top] = data;
          return true;
      }
      
      // Pop method to remove the top value from the stack and print it
      public boolean pop() {
          if (top < 0) {
              return false;
          }
          System.out.println(arr[top--]);
          return true;
      }
      
      // Peek method to print the top value without removing it
      public boolean peek() {
          if (top < 0) {
              return false;
          }
          System.out.println(arr[top]);
          return true;
      }
      
      // Method to return the current size of the stack
      public int size() {
          return top + 1;
      }
  }
  