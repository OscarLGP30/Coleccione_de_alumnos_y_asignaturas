
public class Asignatura implements Comparable<Asignatura>
{
    String codigo = "";
    String nombre = "";

    double calificacion = 0.;

    Asignatura(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.calificacion = -1.;
    }

    double getCalificacion()
    {
        return this.calificacion;
    }

    void setCalificacion(double calificacion)
    {
        this.calificacion = calificacion;
    }

    @Override public String toString()
    {
        return
        (
            this.codigo
            + 
            " - "
            +
            this.nombre
            +
            ". Nota: "
            +
            (this.calificacion == -1. ? "sin calificación" : this.calificacion)
        );
    }

    @Override public int compareTo(Asignatura x)
    {
        return this.codigo.compareTo(x.codigo);
    }
}
