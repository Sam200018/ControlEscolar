import java.util.Scanner;

public class ControlEscolar {

    public static void main(String[] args) {
        int opcion;
        int opcion2;
        Scanner op = new Scanner(System.in);
        System.out.println("Gestión escolar");
        do {
            System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n6.%s", "Alumnos", "Profesores", "Materias", "Curso",
                    "Inscripciones", "Salir");
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
                                "Obtener Lista de profesores", "Obtener profesor", "Obtener cursos",
                                "Salir al Menu princial");
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
                                System.out.println("Obtener profesor");
                                break;

                            case 5:
                                System.out.println("Obtener cursos de un profesor");
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
                case 3:
                    do {
                        System.out.println("Materia");
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s", "Alta Materias", "baja Materias",
                                "Obtener Lista de Materias", "Salir al Menu princial");
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta Materia");
                                break;
                            case 2:
                                System.out.println("Baja Materia");
                                break;
                            case 3:
                                System.out.println("Lista de Materias");
                                break;
                            case 4:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (opcion2 != 4);

                    break;
                case 4:
                    do {
                        System.out.println("Curso");
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n5.%s", "Alta Curso", "Baja curso",
                                "Obtener Lista de cursos","Obtener Lista de inscritos en un grupo", "Salir al Menu princial");
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta Curso");
                                break;
                            case 2:
                                System.out.println("Baja curso");
                                break;
                            case 3:
                                System.out.println("Lista de cursos");
                                break;
                            case 4:
                                System.out.println("Obtener Lista de inscritos en un grupo");
                                break;
                            case 5:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (opcion2 != 4);

                    break;
                case 5:
                        System.out.println("Inscribir Alumno");
                        

                    break;

                case 6:
                    System.out.println("\nFin...calificacion final 10");
                    break;
                default:
                    System.out.println("\nOpcion no valida ");
                    break;
            }

        } while (opcion != 6);

        op.close();
    }
}