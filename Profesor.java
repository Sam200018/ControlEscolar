import java.util.ArrayList;

public class Profesor extends Empleado{
    private ArrayList<Grupo> grupos = new ArrayList<Grupo>();

    public Profesor(){

    }

    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);

    }
    public Profesor(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
    String genero, int numeroEmp, double sueldo, String Puesto, ArrayList<Grupo> grupos){
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero, numeroEmp, sueldo, Puesto);
        this.grupos=grupos;
    }

    public void pideleAlUsuarioTusDatos(){
        super.pideleAlUsuarioTusDatos();
    }

    public void agregarGrupo(Grupo G){
        grupos.add(g);
    }

    public void nuestraTusDatos(){
        super.muestraTusDatos();
        System.out.println("grupos: "=grupos.toString());
    }

    public void quitarGrupo(int index){
        grupos.remove(index);
    }

    public String dameTusGrupos(){
        return grupos.toString();
    }

    public void quitarTodosLosGrupos(){
        grupos.clear();
    }



}