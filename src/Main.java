public class Main {
    public static void main(String[] args) {
        CentroFP UAX;

        Alumno alumno1;
        Alumno alumno2;
        Alumno alumno3;

        // Nuevo centro de FP
        UAX = new CentroFP(20);

        // Nuevos alumnos
        alumno1 = new Alumno(1,"Luca", "DAM", 19);
        alumno2 = new Alumno(2,"Victor Payo", "DAM", 5);
        alumno3 = new Alumno(3,"Kikovich", "DAM", 18);

        // registro alumnos
        UAX.registrarAlumno(alumno1);
        UAX.registrarAlumno(alumno2);
        UAX.registrarAlumno(alumno3);

        // Muestro a los alumnos
        System.out.println("Alumnos registrados: ");
        System.out.println(UAX.mostrarAlumnos());

        // Muestro el número total de alumnos
        System.out.println("El número total de alumnos es: " + UAX.contarAlumnos());
    }


}