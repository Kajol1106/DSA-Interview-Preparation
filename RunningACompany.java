import java.util.*;
import java.util.Arrays;

class employee{
  // complete the class as mentioned in the problem statement
  int employee_id;
  String name;
  int salary;
  boolean stock_options;
  int vesting_period;
  
  employee(int id, String name, int salary, boolean option, int period) {
      this.employee_id = id;
      this.name = name;
      this.salary = salary;
      this.stock_options = option;
      this.vesting_period = period;
  }
  
  int employeeNumber() {
      return employee_id;
  }
  
  String name() {
      return name;
  }
  
  int salary() {
      return salary;
  }
  
  boolean stock_options() {
      if(stock_options) return true;
      return false;
  }
  
  int vesting_period() {
      if(stock_options) return vesting_period;
      return 0;
  }
    
}

class company{
  // complete the class as mentioned in the problem statement
  int size;
  employee[] arr;
  
  company(int size, employee[] arr) {
      this.size = size;
      this.arr = arr;
  }
  
  void sortSalary() {
      Arrays.sort(arr,(a, b)-> {
        return a.salary-b.salary;  
      });
  }
  
  void sortEmployeeId() {
      Arrays.sort(arr,(a, b)-> {
        return a.employee_id-b.employee_id;  
      });
  }
  
  void sortVestingPeriod() {
      Arrays.sort(arr,(a, b)-> {
        return b.vesting_period-a.vesting_period;  
      });
  }
  
  void stockOrNot(int id) {
      boolean flag = false;
      for(employee e: arr) {
          if(e.employee_id==id) {
              flag = true;
              if(e.stock_options) {
                  System.out.println("Stock Granted to "+e.name);
              }
              else {
                  System.out.println("Stock not Granted to "+e.name);
              }
              break;
          }
      }
      
      if(!flag) {
          System.out.println("Invalid Employee ID");
      }
  }
  
  int size() {
      return size;
  }
    
    
}