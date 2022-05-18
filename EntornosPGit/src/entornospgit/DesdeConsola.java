<<<<<<< HEAD

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
    
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.Scanner;
public class DesdeConsola {

    public void maximo() {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            if (max < num) {
                max = num;
            }
        }
        System.out.println("El mayor es " + max);
    }

    public void minimo() {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println("El menor es " + min);
    }
>>>>>>> 593a06690733c5a47c6f4f434d09923a4af73ed1
}
