// Shape Class
class Shape {

    public double getArea() {
      return 0;
    }
    
  }
  
  // A Rectangle is a Shape
  class Rectangle extends Shape {   // extended form the Shape class
  
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }
  
    public double getArea() {
      return this.length * this.width;
    }
    
  }
  
  // A Circle is a Shape
  class Circle extends Shape {
  
    private double radius;
    
    public Circle(double radius) {
      this.radius = radius;
    }
  
    public double getArea() {
      return this.radius * this.radius * 3.14;
    }
  
  
    public static void main(String args[]) {
      Shape[] shape = new Shape[2]; // Creating the shape array of size 2
  
      shape[0] = new Circle(2); // creating the circle object at index 0
      shape[1] = new Rectangle(2, 3); // creating the rectangle object at index 1
  
      System.out.println("Area of Circle: " + shape[0].getArea());
      System.out.println("Area of Rectangle: " + shape[1].getArea());
    }


    /*
     *  Aquí, tenemos tres clases Shape, Circle,y Rectangle. Shapees una clase principal mientras que Circley Rectangleson las clases secundarias.
     *  Las clases secundarias anulan el método getArea()de la clase principal. Tenemos objetos de clases secundarias asignados a la referencia de
     *  la clase principal. Entonces, para determinar qué método se llamaría, el tipo de objeto se determinaría en tiempo de ejecución. Esta es la
     *  razón por la que también se conoce como polimorfismo en tiempo de ejecución.
     */
  
  }