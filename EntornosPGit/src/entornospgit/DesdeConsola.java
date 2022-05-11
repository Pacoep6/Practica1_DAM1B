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
}
