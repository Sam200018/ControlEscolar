import java.util.ArrayList;

public class Materia{

    private String nombre;
    private int ID;
    private int creditos;

    private ArrayList<Curso> cursosOfertados;

    public Materia(String nombre, int ID, int creditos){
        this.nombre = nombre;
        this.ID = ID;
        this.creditos = creditos;
        cursosOfertados = new ArrayList<>();
    }
    public Materia(String nombre, int ID, int creditos, ArrayList<Curso>cursos){
        this.nombre = nombre;
        this.ID = ID;
        this.creditos = creditos;
        cursosOfertados = cursos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCursosOfertados(ArrayList<Curso> cursosOfertados) {
        this.cursosOfertados = cursosOfertados;
    }
    public ArrayList<Curso> getCursosOfertados() {
        return cursosOfertados;
    }

}