
import java.util.ArrayList;
import java.util.Collections;

public class Alumno
{
    int np = 0;

    String nombre = "";

    ArrayList<Asignatura> asignaturas;

    Alumno(int np, String nombre)
    {
        this.np = np;
        this.nombre = nombre;
        this.asignaturas = new ArrayList<Asignatura>();
    }

    void añadirAsignatura(Asignatura asignatura)
    {
        this.asignaturas.add(asignatura);
    }

    Asignatura buscarAsignatura(String codigo)
    {
        for (var asignatura : this.asignaturas)
        {
            if (asignatura.codigo.equals(codigo))
                return asignatura;
        }

        return null;
    }

    boolean eliminarAsignatura(String codigo)
    {
        for (int x = 0, s = this.asignaturas.size(); x < s; ++x)
        {
            if (this.asignaturas.get(x).codigo.equals(codigo))
            {
                this.asignaturas.remove(x);

                return true;
            }
        }

        return false;
    }

    double media()
    {
        double nota_total = 0.;

        int asignaturas = 0;

        for (var asignatura : this.asignaturas)
        {
            if (asignatura.calificacion != -1.)
            {
                nota_total += asignatura.calificacion;

                ++asignaturas;
            }
        }

        return nota_total / asignaturas;
    }

    @Override public String toString()
    {
        Collections.sort(this.asignaturas);

        return
        (
            this.np
            +
            " - "
            +
            this.nombre
            +
            " - "
            +
            this.asignaturas
        );
    }
}
