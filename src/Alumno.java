/**
 * Clase Alumno que representa a un alumno del centro, que consta de los siguientes atributos privados: id, nombre, tituloFP y edad.
 */
public class Alumno {
    private int  id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**
     * Constructor de la clase Alumno
     * @param id identificador del alumno
     * @param nombre nombre del alumno
     * @param tituloFP titulo de fp del alumno
     * @param edad la edad del alumno
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Metodo que devuelve el id
     * @return el id del alumno
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que devuelve el nombre
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que devuelve el titulo de la FP del alumno
     * @return el tituloFP del alumno
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Metodo que devuelve la edad del alumno
     * @return la edad del alumno
     */
    public int getEdad() {
        return edad;
    }
}
