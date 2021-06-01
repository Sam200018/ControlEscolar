import java.util.Scanner;

public class Persona {

    private String fechaNaciento;
    protected String nombre, aPaterno, nacionalidad, genero;
    protected int edad;

    public Persona(String id, String nombre, String APaterno, int edad, String nacionalidad, String fechaNacimiento,
            String genero) {
        this.nombre = nombre;
        this.aPaterno = APaterno;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.fechaNaciento = fechaNacimiento;
        this.genero = genero;
    }

    public Persona(){
        
    }

    public void pideleAlUsuarioTusDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        this.nombre = scanner.nextLine();
        System.out.println("Introduce el apellido paterno");
        this.aPaterno = scanner.nextLine();
        System.out.println("Introduce la edad");
        this.edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el genero");
        this.genero=scanner.nextLine();
        System.out.println("Introduce la nacionalodad");
        this.nacionalidad = scanner.nextLine();
        System.out.println("Introduce la fecha de nacimiento(aaaa-mm-dd)");
        this.fechaNaciento = scanner.nextLine();
        scanner.close();
    }

    public void muestraTusDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("APaterno: " + this.aPaterno);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
        System.out.println("FNacimiento: " + this.fechaNaciento);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }

    public String dameTuNombre() {
        return this.nombre;
    }

    public void cambiaTuNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String dameTuAPaterno() {
        return this.aPaterno;
    }

    public void cambiaTuAPaterno(String Apaterno) {
        this.aPaterno = Apaterno;
    }

    public String dameTuGenero() {
        return this.genero;
    }

    public void cambiaTuGenero(String Genero) {
        this.genero = Genero;
    }

    public Integer dameTuEdad(){
        return this.edad;
    }

    public void cambiaEdad(int edad){
        this.edad=edad;
    }

    public String dameTuNacionalidad(){
        return this.nacionalidad;
    }

    public void cambiaTuNacionalidad(String Nacionalidad){
        this.nacionalidad=Nacionalidad;
    }

    public String dameTuFNacimiento(){
        return this.fechaNaciento;
    }
}