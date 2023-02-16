
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.print("np:");
        var alumno_np = scanner.nextInt();

        System.out.print("nombre:");
        var alumno_nombre = scanner.next();

        var alumno = new Alumno(alumno_np, alumno_nombre);

        for (;;)
        {
            System.out.print(
                            "1. Añadir asignatura\n"
                            +
                            "2. Modificar nota\n"
                            +
                            "3. Eliminar asignatura\n"
                            +
                            "4. Mostrar alumno\n"
                            +
                            "5. Media del alumno\n"
                            +
                            "6. Salir\n"
                            +
                            "selección:"
            );

            var seleccion = scanner.nextInt();

            if (seleccion == 1)
            {
                System.out.print("código:");
                var asignatura_codigo = scanner.next();

                System.out.print("nombre:");
                var asignatura_nombre = scanner.next();

                alumno.añadirAsignatura(new Asignatura(asignatura_codigo, asignatura_nombre));

                System.out.println("Asignatura añadida correctamente");
            }

            if (seleccion == 2)
            {
                System.out.print("código:");
                var asignatura_codigo = scanner.next();

                System.out.print("nota:");
                var asignatura_nota = scanner.nextDouble();

                alumno.buscarAsignatura(asignatura_codigo).setCalificacion(asignatura_nota);

                System.out.println("Nota asignada correctamente");
            }

            if (seleccion == 3)
            {
                System.out.print("código:");
                var asignatura_codigo = scanner.next();

                alumno.eliminarAsignatura(asignatura_codigo);

                System.out.println("Asignatura eliminada correctamente");
            }

            if (seleccion == 4)
            {
                System.out.println(alumno);
            }

            if (seleccion == 5)
            {
                System.out.println(alumno.media());
            }

            if (seleccion == 6)
                break;
        }

        scanner.close();
    }
}