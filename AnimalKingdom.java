/*
abstract class Animal{
  abstract boolean run();
  abstract boolean swim();
  abstract boolean crawl();
  abstract boolean fly();
}
*/
class Tiger extends Animal{
    // declare and define all the functions that are inherited by this class
    boolean run() {return true;}
    boolean swim() {return true;}
    boolean crawl() {return false;}
    boolean fly() {return false;}
  }
  
  class Snake extends Animal{
    // declare and define all the functions that are inherited by this class
    boolean run() {return false;}
    boolean swim() {return true;}
    boolean crawl() {return true;}
    boolean fly() {return false;}
  }
  
  class Eagle extends Animal{
    // declare and define all the functions that are inherited by this class
    boolean run() {return false;}
    boolean swim() {return true;}
    boolean crawl() {return true;}
    boolean fly() {return true;}
  }
  
  class Shark extends Animal{
    // declare and define all the functions that are inherited by this class
    boolean run() {return false;}
    boolean swim() {return true;}
    boolean crawl() {return false;}
    boolean fly() {return false;}
  }
  