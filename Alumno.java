import java.util.Scanner;

public class Alumno extends Persona {
    private int boleta, semestre;
    private double promedioGeneral, creditos;
    private String Carrera;
    // private ArrayList<MatriaInscrita> matrias= new ArrayList<MateriaInscrita>();

    public Alumno(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento, String genero,
            int boleta, String Carrera, int semestre, double creditos, double promediogeneral) {
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero);
        this.boleta = boleta;
        this.Carrera = Carrera;
        this.semestre = semestre;
        this.creditos = creditos;
        this.promedioGeneral = promediogeneral;
    }


    private void calculaPromedio() {
        // Aqui usaremos el promedio de cada materia inscrita en el arrayList y vamos a
        // sacar el promedio y asignarno a 
        //this.promedio=;
    }

    public void pideleAlUsuarioTusDatos() {
        super.pideleAlUsuarioTusDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la boleta del alumno");
        this.boleta = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la carrera del alumno");
        this.Carrera = scanner.nextLine();
        System.out.println("Ingrese el semestre que cursa el alumno");
        this.semestre = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el numero de creditos del alumno(0.0)");
        this.creditos = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el promedio general del alumno(0.0)");
        this.promedioGeneral = Double.parseDouble(scanner.nextLine());
        scanner.close();
    }

    public void muestraTusDatos() {
        super.muestraTusDatos();
        System.out.println("Boleta: " + this.boleta);
        System.out.println("Carrera: " + this.Carrera);
        System.out.println("Promedio General: " + this.promedioGeneral);
        System.out.println("No. Creditos: " + this.creditos);
        System.out.println("Semestre actual: " + this.semestre);
    }

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

}
