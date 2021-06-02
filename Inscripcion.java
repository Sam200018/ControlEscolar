public class Inscripcion {
    
    private Alumno alumno;
    private Curso curso;

    public  Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String toString(){
        String info;
        info = alumno.toString() + "\n";
        return info;
    }
}
