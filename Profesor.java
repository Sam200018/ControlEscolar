import java.util.ArrayList;
import java.util.HashMap;

public class Profesor extends Empleado{
    private ArrayList<Curso> CursosAcargo;
    private static HashMap<Integer, Profesor> ListaProfesores;


    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);
        CursosAcargo = new ArrayList<>();
        AlmacenaProfesores(this);
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

    public static void AlmacenaProfesores(Profesor nuevo){
        ListaProfesores.put(nuevo.getNumeroEmp(), nuevo);
    }

    public static Profesor getProf(int numE){
        return ListaProfesores.get(numE);
    }

}