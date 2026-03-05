/**
 * Clase que represent el Centro de FP sobre el que vamos a trabajar.
 *
 * Como atributos tiene un array de los alumnos y una cantidad maxima de alumnos que será el tamaño del array.
 */
public class CentroFP {
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**
     * Metodo constructor de la clase CentroFP
     * @param cantidadMaximaAlumnos
     */
    public CentroFP(int cantidadMaximaAlumnos) {
        MAX_ALUMNOS = cantidadMaximaAlumnos;
        alumnos = new Alumno[MAX_ALUMNOS];
    }



}
