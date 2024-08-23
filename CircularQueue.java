class circular_queue{
    // implement the class as mentioned in the problem statement above
    int size;
    int[] arr;
    int front;
    int rear;
    int currentSize;
    
    //passing the size through constructor
    public circular_queue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = 0;
        this.currentSize = 0;
    }
    
    public int size() {
        return currentSize;
    }
    
    public boolean isQueueFull() {
        return currentSize==size;
    }
    
    public boolean isQueueEmpty() {
        return currentSize==0;
    }
    
    //to push the value
    public boolean enqueue(int data) {
        if(isQueueFull()) return false;
        
        //adding the element
        arr[rear] = data;
        
        rear = (rear+1)%size;
        currentSize++;
        
        return true;
    }
    
    //to remove the value
    public boolean dequeue() {
        if (isQueueEmpty()) return false;
        
        //printing the removed element
        System.out.println(arr[front]);
        
        front = (front+1)%size;
        currentSize--;
        
        return true;
    }
    
  }
  