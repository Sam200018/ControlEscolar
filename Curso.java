import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private Materia materia;
    private Profesor profesor;
    private int cupo;
    private ArrayList<Inscripcion> alumnosInscritos;
    
    
    public Curso(Materia materia, Profesor profesor, int cupo){
        this.materia = materia;
        this.profesor = profesor;
        this.cupo = cupo;
        alumnosInscritos = new ArrayList<>();
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
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
