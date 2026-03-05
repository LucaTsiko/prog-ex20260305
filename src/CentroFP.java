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
            if(alumnos[i].getId() == id){
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





}
