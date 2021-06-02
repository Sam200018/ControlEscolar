import java.util.Scanner;

public class Empleado extends Persona {
    protected int numeroEmp;
    private double sueldo;
    private String Puesto;
    private static int size;

    static {
        size = 0;
    }

    public Empleado() {
        pideleAlUsuarioTusDatos();
        size++;
        numeroEmp = size;
    }

    public Empleado(String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
            String genero, int numeroEmp, double sueldo, String Puesto) {
        super(nombre, APaterno, edad, nacionalidad, fechaNacimiento, genero);
        size++;
        numeroEmp = size;
        this.sueldo = sueldo;
        this.Puesto = Puesto;
    }

    public void pideleAlUsuarioTusDatos() {
        super.pideleAlUsuarioTusDatos();
        Scanner scanner = new Scanner(System.in);
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

}
