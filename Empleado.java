import java.util.Scanner;

public class Empleado extends Persona {
    private int numeroEmp;
    private double sueldo;
    private String Puesto;

    public Empleado() {
        numeroEmp = 1;
        sueldo = 0;
        Puesto = " ";
    }

    public Empleado(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
            String genero, int numeroEmp, double sueldo, String Puesto) {
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero);
        this.numeroEmp = numeroEmp;
        this.sueldo = sueldo;
        this.Puesto = Puesto;
    }

    public void pideleAlUsuarioTusDatos() {
        super.pideleAlUsuarioTusDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleado");
        this.numeroEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el sueldo de empleado");
        this.sueldo = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el puesto de empleado");
        this.Puesto = scanner.nextLine();
    }

    public void muestraTusDatos() {
        super.muestraTusDatos();
        System.out.println("No. Empleado: " + this.numeroEmp);
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("Puesto: " + this.Puesto);
    }

    public String toString() {
        return super.toString() + "\nNo. Empleado: " + this.numeroEmp + "\nSueldo: " + this.sueldo + "\nPuesto: "
                + this.Puesto;
    }

    public int dameTuNoEmpleado() {
        return this.numeroEmp;
    }

    public void modificaTuNoEmp(int numeroEmp) {
        this.numeroEmp = numeroEmp;
    }

    public double dameTuSueldo() {
        return this.sueldo;
    }

    public void modificaTuSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String dameTuPuesto() {
        return this.Puesto;
    }

    public void modificaTuPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public void modificaTusDatos(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
            String genero, int numeroEmp, double sueldo, String Puesto) {
        super.modificaTusDatos(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero);
        this.numeroEmp = numeroEmp;
        this.sueldo = sueldo;
        this.Puesto = Puesto;
    }
}