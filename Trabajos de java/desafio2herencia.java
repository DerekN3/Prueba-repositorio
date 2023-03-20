// Clase base
class Laptop {

    // Variables datos privadas
    private String name;
  
    public Laptop() { // Constructor por defecto
      name = "";  
    }
  
    public Laptop(String name) { // Constructor parametrizado
      this.name = name;  
    }
  
    // Funcion obtener nombre
    public String getName() {
      return name;
    }
    
  }
  
  // Clase derivada/hijo
  class Dell extends Laptop { 
  
    public Dell() { // Constructor por defecto
  
    }
  
    public Dell(String name) { // Constructor parametrizado 
     super(name);
      }
  
    public String getDetails() { 
      return getName();
    }
  
    public static void main(String args[]) {
     Dell dell = new Dell("Dell Inspiron");
     System.out.println(dell.getDetails());
      
    }
    
  }