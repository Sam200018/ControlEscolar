import java.util.Scanner;

public class ControlEscolar {

    public static void main(String[] args) {
        int opcion;
        int opcion2;
        Scanner op = new Scanner(System.in);
        System.out.println("Gestión escolar");
        do {
            System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n6.%s\n7.%s", "Alumnos", "Profesores", "Materias", "Grupos",
                    "Curso", "Inscripciones", "Salir");
            System.out.println("\nIngrese una opcion");
            opcion = op.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Alumno");
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n5.%s", "Alta alumno", "baja alumno",
                                "Obtener Lista de alumnos", "Obtener alumno", "Salir al Menu princial");
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();

                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta alumno");
                                break;
                            case 2:
                                System.out.println("Baja alumno");
                                break;
                            case 3:
                                System.out.println("Lista de alumnos");
                                break;
                            case 4:
                                System.out.println("Obtener alumno de lista de alumnos");
                                break;
                        
                            case 5:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    } while (opcion2 != 5);

                    break;
                case 2:
                    do {
                        System.out.println("Profesor");
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n6.%s", "Alta profesor", "baja profesor",
                                "Obtener Lista de profesores", "Obtener profesor","Obtener cursos", "Salir al Menu princial");
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta profesor");
                                break;
                            case 2:
                                System.out.println("Baja profesor");
                                break;
                            case 3:
                                System.out.println("Lista de profesores");
                                break;
                            case 4:
                                System.out.println("Obtener profesor de lista de profesores");
                                break;
        
                            case 5:
                                System.out.println("Obtener cursos");
                                break;
                            case 6:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (opcion2 != 6);

                    break;

                case 7:
                    System.out.println("\nFin...calificacion final 10");
                    break;
                default:
                    System.out.println("\nOpcion no valida ");
                    break;
            }

        } while (opcion != 7);




        op.close();
    }
}