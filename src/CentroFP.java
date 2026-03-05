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

    /**
     * Metodo que busca a un Alumno por su id en el array.
     * @param id el identificador del alumno
     * @return el alumno encontrado si coincide su id, nulo en caso contrario
     */
    public Alumno buscarAlumno(int id){
        boolean seguirBuscando = true;
        Alumno alumno = null;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if(alumnos[i] != null && alumnos[i].getId() == id){
                alumno = alumnos[i];
                seguirBuscando = false;
            }
        }
        return alumno;
    }

    /**
     * Metodo que busca la primera posición libre en el array de alumnos.
     * @return la primera posición libre en el array, -1 en caso contrario.
     */
    private int buscarPrimerHuecoLibre(){
        int posicion = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando ; i++) {
            if(alumnos[i] == null){
                posicion = i;
                seguirBuscando = false;
            }
        }
        return posicion;
    }

    /**
     * Metodo que registra a un Alumno antes comprobando su duplicidad y si hay una posicion libre en el array
     * @param alumno el alumno que vamos a registrar
     * @return true si se ha registrado, flase en caso contrario
     */
    public boolean registrarAlumno(Alumno alumno){
        boolean alumnoRegistrado = false;
        int posicionLibre;

        posicionLibre = buscarPrimerHuecoLibre();

        if(buscarAlumno(alumno.getId()) == null){
            if(posicionLibre >= 0 ){
                alumnos[posicionLibre] = alumno;
                alumnoRegistrado = true;
            }

        }
        return alumnoRegistrado;
    }

    /**
     * Metodo que muestra a todos los alumnos del array.
     */
    public String mostrarAlumnos(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if(alumnos[i] != null){
                sb.append(alumnos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Metodo que cuenta a los alumnos que hay en el array
     * @return el numero de alumnos que hay en el array
     */
    public int contarAlumnos(){
        int contador = 0;
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if(alumnos[i] != null){
                contador++;
            }
        }
        return contador;
    }







}
