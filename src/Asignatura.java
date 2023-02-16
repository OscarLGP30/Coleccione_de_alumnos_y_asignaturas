
public class Asignatura
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

    public String toString()
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
}
