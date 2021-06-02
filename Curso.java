import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Curso {
    
    private Materia materia;
    private Profesor profesor;
    private int cupo;
    private int ID_curso;
    
    private ArrayList<Inscripcion> alumnosInscritos;
    
    private static HashMap<Integer, Curso> ListaCursos;


    static{
        ListaCursos = new HashMap<>();
    }

    public Curso(Materia materia, Profesor profesor, int cupo){
        this.materia = materia;
        this.profesor = profesor;
        this.cupo = cupo;
        ID_curso = getID();
        alumnosInscritos = new ArrayList<>();
        Almacenacurso(this);
    }

    public List<Inscripcion> getAlumnosInscritos() {
        return alumnosInscritos;
    }
    public void setAlumnosInscritos(ArrayList<Inscripcion> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }
    public int getCupo() {
        return cupo;
    }
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }public Profesor getProfesor() {
        return profesor;
    }

    public int getID(){
        return ListaCursos.size() + 1;
    }

    public int getID_curso() {
        return ID_curso;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Profesor GetProfesor( ) {
        return profesor;
    }

    public static void Almacenacurso(Curso nuevo){
        ListaCursos.put(nuevo.ID_curso, nuevo);
    }

    public void AgregaAlumno(Inscripcion nuevo){
        alumnosInscritos.add(nuevo);
    }

    public String toString(){
        String info;
        info = "Curso: " + ID_curso + "\tMateria: " + materia + "\tProfesor: " +  profesor + "\nCupo restante: " + cupo + "\n";
        return info;
    }
    public String listaInscritos(){
        String info = "";
        for (Inscripcion inscripcion : alumnosInscritos) {
            info += inscripcion + "\n";
        }
        return info;
    }

    public static void Lista(){
        Iterator iterador = ListaCursos.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry par = (Map.Entry)iterador.next();
            Curso A = (Curso)  par.getValue();
            System.out.println(A);
        }
    }

}
