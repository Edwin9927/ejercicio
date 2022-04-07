package ejercicio;

/**
 *
 * @author edwinmanzano
 */
public class triangulo {
    private float altura, base;
    
    public triangulo(float altura, float base){
        this.altura = altura;
        this.base = base;
    }
    
    public float area (){
        return ((altura * base)/2);
    }
    
}