/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NumConsola {
    public void numC(){
        /*Contar las cifras de un número entero introducido,
        con 5 cifras como máximo.*/
        int num = 0;
        int cifras = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero de 5 cifras como maximo");
        num = sc.nextInt();
        if(num>0 && num<10000){
        while(num!=0){
            num=num/10;
            cifras++;
        }
        System.out.println("cifras = " + cifras);    
        }
        else{
            System.out.println("Introduce un numero correcto");
        }
    }
    }

