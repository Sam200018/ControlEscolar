import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Materia{

    private String nombre;
    private int ID;
    private int creditos;

    private List<Curso> cursosOfertados;

    public Materia(String nombre, int ID, int creditos){
        this.nombre = nombre;
        this.ID = ID;
        this.creditos = creditos;
        cursosOfertados = new ArrayList<>();
    }
    public Materia(String nombre, int ID, int creditos, List<Curso>cursos){
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
    public void setCursosOfertados(List<Curso> cursosOfertados) {
        this.cursosOfertados = cursosOfertados;
    }
    public List<Curso> getCursosOfertados() {
        return cursosOfertados;
    }

}