
package entornospgit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Consola {
 
     List lista = new ArrayList();
     Scanner sc = new Scanner (System.in);
     int numero=0;

     public void bucle(){
     do {
    numero = sc.nextInt();
    lista.add(numero);
    
} while (numero!=0);
     
    
}
}
