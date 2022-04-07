package ejercicio;

import java.util.Scanner;

/**
 *
 * @author edwinmanzano
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base, altura;
        int sw = 1;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println(" Área del triángulo de base y altura conocidas ");
            System.out.println("-----------------------------------------------");

            try{
            System.out.println("Ingrese el valor de la base (m): ");
            base = in.nextFloat();
            System.out.println("Ingrese el valor de la altura (m): ");
            altura = in.nextFloat();
                if(base <= 0 || altura <=0){
                    throw new Exception();
                }else
                {
                    triangulo tri = new triangulo(base, altura);
                    System.out.println("-----------------------------------------------");
                    System.out.println("El área del triángulo es: "+ String.format("%.2f", tri.area()) + " m²");
                    System.out.println("-----------------------------------------------");
                    sw = 0;
                }
            }catch (Exception e){
                System.out.println("-----------------------------------------------");
                System.out.println("! ! ! ! ! !     Datos Inválidos     ! ! ! ! ! !");
                System.out.println("-----------------------------------------------\n");
                System.out.println("- Ingrese los datos nuevamente \n");
                in.nextLine();
            }
        }while(sw == 1);
    }
}
