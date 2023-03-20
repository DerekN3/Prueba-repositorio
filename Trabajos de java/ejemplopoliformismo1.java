// Una clase de ejemplo que prove un metodo para obtener el area de la forma
class Shape {

    public double getArea() {
      return 0;
    }
    
  }
  
  // Un rectangulo es una forma con un ancho y largo especificos
  class Rectangle extends Shape {   // Se extiende desde la clase forma
  
    private double width;
    private double height;
  
    public Rectangle(double width, double heigh) {
      this.width = width;
      this.height = heigh;
    }
  
    public double getArea() {       //Aqui se anula el metodo de la clase base
      return width * height;          
    }
    
  }
  
  // Un circulo es una forma con un radio especifico
  class Circle extends Shape {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius; 
    }
    public double getArea() {             //Aqui se anula el metodo de la clase base                     
      return 3.14 * radius * radius; 
    }
    
  }
  
  
  class driver {
  
    public static void main(String args[]) {
      Shape[] shape = new Shape[2]; // Se crea un array de la clase forma con 2 de longitud
  
      shape[0] = new Circle(2); // Se crea un objeto circulo en el index 0
      shape[1] = new Rectangle(2, 2); // Se crea un objeto rectangulo en el index 1
  
      System.out.println("Area of the Circle: " + shape[0].getArea());
      System.out.println("Area of the Rectangle: " + shape[1].getArea());
    }

        /*Nota:
        *
        *  Desde una clase padre se pueden crear arreglos y cada uno de sus elementos puede ser un
        *  objeto de las clases hijo.  
        * 
        */
  }
