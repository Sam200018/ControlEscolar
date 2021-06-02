import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Materia{

    private String nombre;
    private int ID;
    private int creditos;

    private ArrayList<Curso> cursosOfertados;

    private static HashMap<Integer, Materia> ListaMaterias;


    static{
        ListaMaterias = new HashMap<>();
    }

    public String toString(){
        String info = "";
        info += "Materia: " + nombre + "\tID: " + ID + "\tCreditos: " +  creditos + "\n";
        for (Curso curso : cursosOfertados) {
            info += curso + "\n";
        }
        return info;
    }

    public Materia(String nombre, int creditos){
        this.nombre = nombre;
        ID = generaID();
        this.creditos = creditos;
        cursosOfertados = new ArrayList<>();
        AlmacenaMateria(this);
    }
    public Materia(String nombre,int creditos, ArrayList<Curso>cursos){
        this.nombre = nombre;
        ID = generaID();
        this.creditos = creditos;
        cursosOfertados = cursos;
        AlmacenaMateria(this);
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

    public int generaID(){
        return ListaMaterias.size() + 1;
    }

    public static void AlmacenaMateria(Materia nuevo){
        ListaMaterias.put(nuevo.getID(), nuevo);
    }

    public void Addcurso(Curso e){
        cursosOfertados.add(e);
    }

    
    public static void Lista(){
        Iterator iterador = ListaMaterias.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry par = (Map.Entry)iterador.next();
            Materia A = (Materia)  par.getValue();
            System.out.println(A);
        }
    }

    public static Materia getMateria(int ID){
        return ListaMaterias.get(ID);
    }

}