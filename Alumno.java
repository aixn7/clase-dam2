public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombreCompleto.length() < 3) {
            System.out.println ("Longitud de nombre demasiado corta, puede generar errores");
        }
        if (numeroMatriculaAlumno.length() < 4) {
            System.out.println ("Longitud de matrícula demasiado corta, puede generar errores");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreUsuario1;
        if (nombre.length() >= 3) {
            nombreUsuario1 = nombre.substring(0, 3);
        }
        else {
            nombreUsuario1 = nombre;
        }
        String nombreUsuario2;
        if (numeroMatricula.length() >= 4) {
            nombreUsuario2 = numeroMatricula.substring(0, 4);
        }
        else {
            nombreUsuario2 = numeroMatricula;
        }
        return nombreUsuario1 + nombreUsuario2;
    }
}
