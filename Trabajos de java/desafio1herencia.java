// Clase base
class Vehicle {

    // Variables privadas clase base
    private String speed;
    private String model;
  
    public Vehicle() { // Constructor por defecto
      speed = "100";
      model = "Tesla";
    }
  
    // Funcion obtener velocidad
    public String getSpeed() {
      return speed;
    }
  
    // Funcion obtener modelo
    public String getModel() {
      return model; 
    }
    
  }
  
  // Clase derivada/hijo
  class Car extends Vehicle { 
  
    public String name; //  Nombre del coche
  
    public Car() { // Constructor por defecto
      name = "";
    }
  
    // Esta funcion establece el nombre del coche
    public void setDetails(String name) { // Funcion establecer
      this.name = name;
    }
  
    // Esta funcion llama a la funcion de la  clase base y muestra el resultado como entrada
    public String getDetails(String carName) {
      String details = carName + ", " + getModel() + ", " + getSpeed(); // Llamando a la funcion de la clase base
      return details;
    } 
  
  
    public static void main(String args[]) {
      Car car = new Car();
      System.out.println(car.getDetails("X"));
    }
    
  }