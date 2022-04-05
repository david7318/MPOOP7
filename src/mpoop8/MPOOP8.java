package mpoop8;

import actividadExtra.Auto;
import actividadExtra.Gato;
import actividadExtra.Copiloto;
import actividadExtra.Perro;
import actividadExtra.Piloto;
import figuras.Cuadrilatero;
import figuras.Poligono;
import figuras.Triangulo;

/**
 * Clase principal.
 * @author Danna Blanco, David Gómez, David Montoya
 */
public class MPOOP8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono = new Poligono();
        System.out.println(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        Object objeto = new Object();
        System.out.println(objeto);
        objeto = new Poligono();
        System.out.println(objeto);
        objeto = new Triangulo();
        System.out.println(objeto);
        
        getPoligono(new Triangulo());
        getPoligono(new Cuadrilatero());
        getPoligono(new Poligono());
        
        // Marca error porque no se puede almacenar la información
        // de una clase superior en una de menor jerarquía.
        //Triangulo t2 = new Poligono(); -> No se puede.
        
        System.out.println("\n-------------- Actividades extra --------------");
        
        //Implementar clases generadas en el diagrama de clases e instanciarlas.
        
        System.out.println("\n-------------- Perro --------------");
        Perro perro  = new Perro(true, true, true, "Café", "Mestizo", "Verdes", "Laila", 5);
        System.out.println(perro);
        
        System.out.println("\n-------------- Gato --------------");
        Gato gato = new Gato( true , true , false, "azul", "chino", "verde", "Misifus", 2);
        System.out.println(gato);
        
        System.out.println("\n-------------- Piloto --------------");
        Piloto piloto = new Piloto(121,perro,"Omar Cruz",27);
        System.out.println(piloto);
        
        System.out.println("\n-------------- Copiloto --------------");
        Copiloto copiloto = new Copiloto(2185,gato,"Lara Croft",23);
        System.out.println(copiloto);
        
        System.out.println("\n-------------- Auto --------------");
        Auto auto = new Auto(4,4,2021,"Corolla");
        System.out.println(auto);
         
        System.out.println("\n-------------- Asignando lugar a los pasajeros de un auto --------------");
        auto.asignarAsiento(perro);
        auto.asignarAsiento(gato);
        auto.asignarAsiento(piloto);
        auto.asignarAsiento(copiloto);
    }
    
    /**
     * Método definido por el programador en la clase principal que indica la clase de polígono a la que pertenece un objeto de tipo "Poligono".
     * @param pol Un tipo de dato "Poligono".
     */
    public static void getPoligono(Poligono pol){
        if(pol instanceof Triangulo){
            System.out.println("El polígono es un triángulo.");
        }else if (pol instanceof Cuadrilatero){
            System.out.println("El poligono es un cuadrilátero.");
        }else{
            System.out.println("El polígono es otra figura.");
        }
    } 
}
