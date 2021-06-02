import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

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

    public static void Almacenacurso(Curso nuevo){
        ListaCursos.put(nuevo.ID_curso, nuevo);
    }

    public void AgregaAlumno(Inscripcion nuevo){
        alumnosInscritos.add(nuevo);
    }

}
