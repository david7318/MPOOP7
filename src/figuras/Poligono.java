package figuras;
/**
 * Clase que crea un polígono.
 * @author Danna Blanco, David Gómez, David Montoya
 */
public class Poligono {
    
    /**
     * Constructor vacío.
     */
    public Poligono() {
    }
    
    /**
     * Método que devuelve el área del polígono.
     * @return Retorna un valor nulo del área.
     */
    public float area(){
        return 0;
    }
    
    /**
     * Método que devuelve el perímetro de un polígono.
     * @return Retorna un valor nulo del perímetro.
     */
    public float perimetro(){
        return 0;
    }
    
    /**
     * Método que devuelve la información del polígono.
     * @return Devuelve la informacion del poligono en forma de String.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
