import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ControlEscolar {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
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
            clearScreen();
            switch (opcion) {
                case 1:
                int boleta;
                    do {
                        System.out.println("Alumno");
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n5.%s", "Alta alumno", "baja alumno",
                                "Obtener Lista de alumnos", "Obtener alumno", "Salir al Menu princial");
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();
                        clearScreen();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta alumno");
                                Alumno nuevo = new Alumno();
                                System.out.println("Alta con éxito");
                                break;
                            case 2:
                                System.out.println("Baja alumno");
                                System.out.println("Ingresa la boleta del alumno: ");
                                boleta = op.nextInt();
                                Alumno.EliminaAlumno(boleta);
                                break;
                            case 3:
                                System.out.println("Lista de alumnos");
                                Alumno.Lista();
                                break;
                            case 4:
                                System.out.println("Obtener alumno de lista de alumnos");
                                System.out.println("Ingresa la boleta del alumno: ");
                                boleta = op.nextInt();
                                Alumno info = Alumno.getAlumno(boleta);
                                if(info != null)
                                    System.out.println(info);
                                else
                                    System.out.println("ERROR Boleta no encontrada");
                                break;
                            case 5:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        System.out.println("Continuar[ENTER]");
                        op.nextLine();
                        op.nextLine();
                        clearScreen();
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
                        int numEmp;
                        clearScreen();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta profesor");
                                Profesor nuevo = new Profesor();
                                System.out.println("Alta con éxito");
                                break;
                            case 2:
                                System.out.println("Baja profesor");
                                System.out.println("Ingresa número de empleado: ");
                                numEmp = op.nextInt();
                                Profesor.EliminaProfesor(numEmp);
                                break;
                            case 3:
                                System.out.println("Lista de profesores");
                                Profesor.Lista();
                                break;
                            case 4:
                                System.out.println("Obtener profesor");
                                System.out.println("Ingresa número de empleado: ");
                                numEmp = op.nextInt();
                                System.out.println(Profesor.getProf(numEmp));
                                break;

                            case 5:
                                System.out.println("Obtener cursos de un profesor");
                                System.out.println("Ingresa número de empleado: ");
                                numEmp = op.nextInt();
                                Profesor.getProf(numEmp).gruposAcargo();
                                break;
                            case 6:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        System.out.println("Continuar[ENTER]");
                        op.nextLine();
                        op.nextLine();
                        clearScreen();
                    } while (opcion2 != 6);
                    break;
                case 3:
                    do {
                        System.out.println("Materia");
<<<<<<< HEAD
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s", "Alta Materias",
                                "Obtener Lista de Materias", "Agrega grupos a una materia", "Salir al Menu princial");
=======
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s", "Alta Materias","Obtener Lista de Materias", "Agrega grupos a una materia", "Salir al Menu princial");
>>>>>>> b5cf8ff3ac70bf039a0ff780bfe427365f2aa2e5
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();
                        clearScreen();
                        Scanner opAUX = new Scanner(System.in);
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta Materia");
                                String nombre;
                                System.out.println("Nombre de la materia");
                                nombre = opAUX.nextLine();
                                int creditos;
                                System.out.println("Creditos de la materia");
                                creditos = opAUX.nextInt();
                                Materia nueva = new Materia(nombre, creditos);
                                break;
                            case 2:
                                System.out.println("Lista de Materias");
                                Materia.Lista();
                                break;
                            case 3:
                                System.out.println("Agrega grupos a una materia");
                                System.out.println("ID de la materia a vincular");
                                int IDmateria = op.nextInt();
                                Materia vincular = Materia.getMateria(IDmateria);
                                System.out.println("ID del curso a agregar");
                                int IDcurso = op.nextInt();
                                Curso anexar = Curso.getCurso(IDcurso);
                                if(anexar != null && vincular != null){
                                    vincular.Addcurso(anexar);
                                }
                                else
                                    System.out.println("ERROR ID  no encontrada");
                                break;
                            case 4:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        System.out.println("Continuar[ENTER]");
                        op.nextLine();
                        op.nextLine();
                        clearScreen();
                    } while (opcion2 != 4);

                    break;
                case 4:
                    do {
                        System.out.println("Curso");
                        System.out.format("1.%s\n2.%s\n3.%s\n4.%s\n", "Alta Curso","Obtener Lista de cursos","Obtener Lista de inscritos en un grupo", "Salir al Menu princial");
                        System.out.println("\nIngrese una opcion");
                        opcion2 = op.nextInt();
                        clearScreen();
                        Scanner opAUX2 = new Scanner(System.in);
                        switch (opcion2) {
                            case 1:
                                System.out.println("Alta Curso");
                                int IDmat, IDprof, cupo;
                                System.out.println("ID de la materia a vincular");
                                IDmat = opAUX2.nextInt();
                                System.out.println("ID del profesor a vincular");
                                IDprof= opAUX2.nextInt();
                                System.out.println("Límite de cupo");
                                cupo = opAUX2.nextInt();
                                Profesor pvinculo = Profesor.getProf(IDprof);
                                Materia mvincu = Materia.getMateria(IDmat);
                                if(pvinculo != null && mvincu != null){
                                    Curso cnuevo = new Curso(mvincu, pvinculo, cupo);
                                    mvincu.Addcurso(cnuevo);
                                    pvinculo.Addcurso(cnuevo);
                                }else
                                System.out.println("ERROR EN LOS DATOS");
                                break;
                            case 2:
                                System.out.println("Lista de cursos");
                                Curso.Lista();
                                break;
                            case 3:
                                System.out.println("Obtener Lista de inscritos en un grupo");
                                System.out.println("ID del curso");
                                int IDc = opAUX2.nextInt();
                                Curso info = Curso.getCurso(IDc);
                                if(info != null){
                                    info.listaInscritos();
                                }else
                                System.out.println("ERROR EN LOS DATOS");
                                break;
                            case 4:
                                System.out.println("Salir al Menu principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        System.out.println("Continuar[ENTER]");
                        op.nextLine();
                        op.nextLine();
                        clearScreen();
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
            System.out.println("Continuar[ENTER]");
            op.nextLine();
            clearScreen();
        } while (opcion != 6);

        op.close();
    }
}