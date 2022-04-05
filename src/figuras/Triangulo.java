package figuras;
/**
 * Clase que crea un triángulo.
 * @author Danna Blanco, David Gómez, David Montoya
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gamma;
    private float a, b, c;
    private float base, altura;
    
    /**
     * Constructor vacio
     */
    public Triangulo() {
    }
    /**
     * Constructor que recibe los parámetros para construir un triangulo.
     * @param base La base del triángulo.
     * @param altura La altura del triángulo.
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Método con sobreescritura del método perímetro de la clase Poligono.
     * @return Devuelve el valor del perímetro del triángulo.
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
    
    /**
     * Método con sobreescritura del método área de la clase Poligono.
     * @return Devuelve el valor del área del triángulo.
     */
    @Override
    public float area(){
        return base*altura/2;
    }
    /**
     * Método que devuelve la información del triángulo.
     * @return Retorna la información del triángulo.
     */
    @Override
    public String toString() {
        return  "Triangulo{" + "alfa=" + alfa 
                + ", beta=" + beta + ", gamma=" 
                + gamma + ", a=" + a + ", b=" +
                b + ", c=" + c + ", base=" + base
                + ", altura=" + altura + '}';
    }
}
