
package entornospgit;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DesdeConsola {
    
    public void valor_mayorymenor(){
        
        Scanner teclado = new Scanner(System.in);

                System.out.print("Ingrese un numero: ");
                int temp = teclado.nextInt();

                int numero = 0;
                int numeroMayor = temp; //el primer valor se lo asignas al mayor
                int numeroMenor = temp; //y al menor, de esta forma evitas comenzar con 0

                for (int i = 0; i < 4; i++) {

                    System.out.print("Ingrese un numero: ");
                    numero = teclado.nextInt();

                    if(numero > numeroMayor){
                        numeroMayor = numero;
                    }

                    if(numero < numeroMenor){
                        numeroMenor = numero;
                    }  
                }

                System.out.println("El numero mayor es: " + numeroMayor);
                System.out.println("El numero menor es: " + numeroMenor);

      
}
    
}
