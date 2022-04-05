package figuras;
/**
 * Clase que crea un cuadrilátero.
 * @author Danna Blanco, David Gómez, David Montoya
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float a,b;
    private float base,altura;
    /**
     * Constructor vacío.
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor con parámetros para crear un objeto de tipo Cuadrilatero.
     * @param base La base del cuadrilátero.
     * @param altura La altura del cuadrilátero.
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Método con sobreescritura del método área de la clase Poligono que calcula el perímetro del cuadrilátero.
     * @return Regresa el valor del perímetro.
     */
    @Override
    public float perimetro(){
        return 2*a + 2*b;
    }
    /**
     * Método con sobreescritura del método área de la clase Poligono que calcula el área del cuadrilátero.
     * @return Regresa el valor del área.
     */
    @Override
    public float area(){
        return base*altura;
    }
    
    /**
     * Método que devuelve la información del cuadrilátero.
     * @return Devuelve la informacion del cuadrilátero en forma de String.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
