import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Alumno extends Persona {
    private int boleta, semestre;
    private double promedioGeneral, creditos;
    private String Carrera;

    private static HashMap<Integer, Alumno> ListaAlumnos;


    static{
        ListaAlumnos = new HashMap<>();
    }
    // private ArrayList<MatriaInscrita> matrias= new ArrayList<MateriaInscrita>();

    public Alumno(){
        pideleAlUsuarioTusDatos();
        boleta = generaBoleta();
        creditos = 0;
        promedioGeneral = 0.0;
        semestre = 1;
        AlmacenaAlumno(this);
    }

    public Alumno(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento, String genero, String Carrera, int semestre, double creditos, double promediogeneral) {
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero);
        this.Carrera = Carrera;
        this.semestre = semestre;
        this.creditos = creditos;
        this.promedioGeneral = promediogeneral;
        boleta = generaBoleta();
        AlmacenaAlumno(this);
    }


    @Override
    public void pideleAlUsuarioTusDatos() {
        super.pideleAlUsuarioTusDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la carrera del alumno");
        this.Carrera = scanner.nextLine();
    }

    @Override
    public void muestraTusDatos() {
        super.muestraTusDatos();
        System.out.println("Boleta: " + this.boleta);
        System.out.println("Carrera: " + this.Carrera);
        System.out.println("Promedio General: " + this.promedioGeneral);
        System.out.println("No. Creditos: " + this.creditos);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBoleta: " + this.boleta + "\nCarrera: " + this.Carrera + "\nPrmedio general: "
                + this.promedioGeneral + "\nNo. de Creditos: " + this.creditos + "\nSemestre Actual: " + this.semestre;
    }

    public int dameTuBoleta() {
        return this.boleta;
    }

    public void modificaTuBoleta(int boleta) {
        this.boleta = boleta;
    }

    public String dameTuCarrera() {
        return this.Carrera;
    }

    public void modificaTuCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public double dameTuPromedioG() {
        return this.promedioGeneral;
    }

    public void modificaTuPromedio(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public double dameTusCreditos() {
        return this.creditos;
    }

    public void modificaTusCreditos(double creditos) {
        this.creditos = creditos;
    }

    public int dameTuSemestre() {
        return this.semestre;
    }

    public void modificaTuSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public int generaBoleta(){
        return ListaAlumnos.size() + 1;
    }

    public static void AlmacenaAlumno(Alumno nuevo){
        ListaAlumnos.put(nuevo.boleta, nuevo);
    }

    public static void EliminaAlumno(int boleta){
        Alumno alumnoBorrar = ListaAlumnos.get(boleta);
        if(alumnoBorrar != null){
            ListaAlumnos.remove(boleta);
            System.out.println("Alumno eliminado con éxito");
        }
        else
            System.out.println("Boleta no encontrada");
    }

    public static void Lista(){
        Iterator iterador = ListaAlumnos.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry par = (Map.Entry)iterador.next();
            Alumno A = (Alumno)  par.getValue();
            System.out.println(A + "\n\n");
        }
    }

    public static Alumno getAlumno(int boletaa){
        return ListaAlumnos.get(boletaa);
    }

}
