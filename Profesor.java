import java.util.List;

public class Profesor extends Empleado{
    private List<Curso> CursosAcargo;

    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);

    }
    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto, List<Curso> Cursos){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);
        CursosAcargo = Cursos;
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