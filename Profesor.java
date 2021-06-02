import java.util.ArrayList;

public class Profesor extends Empleado{
    private ArrayList<Curso> CursosAcargo;

    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);
        CursosAcargo = new ArrayList<>();
    }
 
    public void pideleAlUsuarioTusDatos(){
        super.pideleAlUsuarioTusDatos();
    }


    public void nuestraTusDatos(){
        super.muestraTusDatos();
        System.out.println("Cursos: " + CursosAcargo.toString());
    }

    public String dameTusCursos(){
        return CursosAcargo.toString();
    }

}