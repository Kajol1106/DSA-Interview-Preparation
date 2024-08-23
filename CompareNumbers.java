/*
interface comparison{
  public int comparemax(int a,int b);
  public int comparemax(int a,int b,int c);
  public int comparemax(int a,int b,int c,int d);
  public int comparemax(int a);
  public int comparemin(int a);
  public int comparemin(int a,int b);
  public int comparemin(int a,int b,int c);
  public int comparemin(int a,int b,int c,int d);
    
  
}
*/
class numberclass implements comparison{
    // complete the class which implements the comparison class
   //comapre max 
   public int comparemax(int a,int b) {
       return Math.max(a, b);
   }
   
   public int comparemax(int a,int b,int c) {
       return Math.max(a, Math.max(b, c));
   }
   
   public int comparemax(int a,int b,int c,int d) {
       return Math.max(a, Math.max(b, Math.max(c, d)));
   }
   
   public int comparemax(int a) {
       return a;
   }
   
   //compare min
   public int comparemin(int a) {
       return a;
   }
   
   public int comparemin(int a,int b) {
       return Math.min(a, b);
   }
   
   public int comparemin(int a,int b,int c) {
       return Math.min(a, Math.min(b, c));
   }
   
   public int comparemin(int a,int b,int c,int d) {
       return Math.min(a, Math.min(b, Math.min(c, d)));
   }
     
 }
 