/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 * El programa mostrará los máximos y mínimos
 *
 * @author PACO
 */
public class EntornosPGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selec = 0;
        Scanner sc = new Scanner(System.in);
        //Panel de salida al usuario:
        System.out.println("Bienvenido al mostrador de máximos y mínimos");
        System.out.println("¿Desde dónde quiere trabajar? \n 1) Fichero \n 2) Consola \n Otro: salir)");
        System.out.println("Si eliges 1, Recuerda introducir Fichero.txt con los números, a ser posible uno en cada línea");

        //Menú:
        switch (sc.nextInt()) {
            case 1:
                DesdeFichero fich = new DesdeFichero();
                fich.maximo();
                fich.minimo();

                break;

            case 2:
                //Mayor menor desde consola
                DesdeConsola consola= new DesdeConsola();
                
                consola.valor_mayorymenor();
                
                break;
            default:
                System.out.println("Saliendo...");
        }

    }

}
