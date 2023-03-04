// clase rectangulo
class Rectangle {

    // Write Fields Here
    private int length;
    private int width;
    
    
    public Rectangle() {
     
      // Write your code here
      length = 0;
      width = 0;
      
    }
    
    public Rectangle(int length, int width) {
  
      // Write your code here
      this.length = length;
      this.width = width;
  
    }
  
    public int getArea() {
  
      // Write your code here
      return this.length * this.width;
     
    }
    
  }

public class ejercicio_encapsulacion1 {

    public static void main(String[] args) {
        
        Rectangle obj = new Rectangle(5,5);
        System.out.println(obj.getArea());
        
    }
    
}
