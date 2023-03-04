// Student Class
class Student {

    // Declare Fields Here
    private String name;
    private String rollNumber;

    public Student(){ //Constructor por defecto
      name = "Unknown";
      rollNumber = "N/A";
    }
    
    // Write Getters/Setters here
    public String getName(){
  
      return this.name;
  
    }
  
    public void setName(String name){
  
      this.name = name;
  
    }
  
    public String getRollNumber(){
  
      return this.rollNumber;
  
    }
  
    public void setRollNumber(String rollNumber){
  
      this.rollNumber = rollNumber;
  
    }
  
  }


public class ejercicio_encapsulacion2 {
    public static void main(String[] args) {
      
    Student x = new Student();
    System.out.println(x.getName());
    x.setName("Samantha");
    String student_name = x.getName();
    System.out.println(student_name);

    System.out.println(x.getRollNumber());
    x.setRollNumber("2211");
    String student_rollnum = x.getRollNumber();
    System.out.println(student_rollnum);


    }
}
