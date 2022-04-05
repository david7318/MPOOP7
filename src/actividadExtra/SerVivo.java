package actividadExtra;

/**
 * Clase que crea un ser vivo.
 * @author Danna Blanco, David Gómez, David Montoya
 */
public class SerVivo {
    private String nombre;
    private int edad;
    
    /**
     * Constructor vacío.
     */
    public SerVivo() {
    }

    /**
     * Constructor con parámetros que crea un ser vivo.
     * @param nombre Nombre del ser vivo.
     * @param edad Edad del ser vivo.
     */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    /**
     * Método que indica cuando el ser vivo respira.
     * @return Retorna la acción que realiza el ser vivo como cadena.
     */
    public String repirar(){
        return "Estoy respirando";
    }
    
    /**
     * Método que indica cuando el ser vivo duerme.
     * @return Retorna la acción que realiza el ser vivo como cadena.
     */
    public String dormir(){
        return "Estoy durmiendo";
    }
    
    /**
     * Método que indica cuando el ser vivo come.
     * @return Retorna la acción que realiza el ser vivo como cadena.
     */
    public String comer(){
        return "Estoy comiendo";
    }

     /**
     * Método que devuelve la información del ser vivo.
     * @return Devuelve la informacion del ser vivo en forma de String.
     */
    @Override
    public String toString() {
        return "\nSerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
