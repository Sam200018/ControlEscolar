import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Profesor extends Empleado{
    private ArrayList<Curso> CursosAcargo;
    private static HashMap<Integer, Profesor> ListaProfesores;
    
    static{
        ListaProfesores = new HashMap<>();
    }

    public Profesor(){
        super.pideleAlUsuarioTusDatos();
        CursosAcargo = new ArrayList<Curso>();
        AlmacenaProfesores(this);
    }

    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);
        CursosAcargo = new ArrayList<Curso>();
        AlmacenaProfesores(this);
    }
 
    public void pideleAlUsuarioTusDatos(){
        super.pideleAlUsuarioTusDatos();
    }


    public void nuestraTusDatos(){
        super.muestraTusDatos();
    }

    public String dameTusCursos(){
        return CursosAcargo.toString();
    }

    public static void AlmacenaProfesores(Profesor nuevo){
        ListaProfesores.put(nuevo.numeroEmp, nuevo);
    }

    public static Profesor getProf(int numE){
        return ListaProfesores.get(numE);
    }
    public static void EliminaProfesor(int numE){
        Profesor profesorBorrar = ListaProfesores.get(numE);
        if(profesorBorrar != null)
            ListaProfesores.remove(numE);
        else
            System.out.println("Boleta no encontrada");
    }
    public static void Lista(){
        Iterator iterador = ListaProfesores.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry par = (Map.Entry)iterador.next();
            Profesor A = (Profesor)  par.getValue();
            System.out.println(A);
        }
    }
    public void gruposAcargo(){

        for (Curso curso : CursosAcargo) {
            System.out.println(curso);
        }
    }

    public void Addcurso(Curso e){
        CursosAcargo.add(e);
    }


}