import java.util.ArrayList;

class Empresa{

    private String nombre;
    private String cif;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(5);
    
    public Empresa(){

        nombre = "";
        cif = "";

    }


    public Empresa(String nombre, String cif){

        this.nombre = nombre;
        this.cif = cif;

    }

    public void contratar(Empleado empleado){

        listaEmpleados.add(empleado);
        System.out.println("El empleado "+ empleado.getNombre() + " a sido añadido con exito");
    }

    public void despedir(Empleado empleado){

        listaEmpleados.remove(empleado);
        System.out.println("El empleado "+ empleado.getNombre() +" a sido elimina de la base de datos con exito");

        }
    
    public void mostrarEmpleados(){
              
        for (Empleado nombre : listaEmpleados) {
            
            System.out.println(nombre.getTodo()); //ciclo for echo lee todos los elementos del array y no puede tener errores. Solo le y un array a la vez

        }
    }

    }



class Empleado {

    private String nombre;
    private String dni;
    private double salario;

    public Empleado(String nombre, String dni, double salario){

        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;

    }

    public String getTodo(){

        return nombre+","+dni+","+salario;

    }

    public String getNombre(){

        return nombre;

    }


    public static void main(String[] args) {
        
        Empresa empresa = new Empresa("Microsoft","2354");

        Empleado empleado1 = new Empleado("Paco", "12245654", 12500);
        Empleado empleado2 = new Empleado("Ricardo", "76941235",7000);
        Empleado empleado3 = new Empleado("Mauricio", "96472317", 20000);
        empresa.contratar(empleado1);
        empresa.contratar(empleado2);

        empresa.despedir(empleado2);

        empresa.contratar(empleado3);

        empresa.mostrarEmpleados();
    }
}