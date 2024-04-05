/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto15;

import java.util.Scanner;

public class EjercicioResuelto15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double BolaA, BolaB, BolaC, BolaD;

        System.out.println("Ingrese peso BolaA");
        BolaA = sc.nextDouble();

        System.out.println("Ingrese peso BolaB");
        BolaB = sc.nextDouble();

        System.out.println("Ingrese peso BolaC");
        BolaC = sc.nextDouble();

        System.out.println("Ingrese peso BolaD");
        BolaD = sc.nextDouble();

        if (BolaA == BolaB && BolaA == BolaC) {

            System.out.print("La BolaD es la diferente ");

            if (BolaA < BolaD) {

                System.out.println("Y es de mayor peso");

            } else {

                System.out.println("Y es de menor peso");

            }

        } else {

            if (BolaA == BolaB && BolaA == BolaD) {

                System.out.print("La BolaC es la diferente ");

                if (BolaA < BolaC) {

                    System.out.println("Y es de mayor peso");

                } else {

                    System.out.println("Y es de menor peso");

                }

            } else {

                if (BolaA == BolaC && BolaA == BolaD) {

                    System.out.print("La BolaB es la diferente ");

                    if (BolaA < BolaB) {

                        System.out.println("Y es de mayor peso");

                    } else {

                        System.out.println("Y es de menor peso");

                    }

                } else {
                    
                    System.out.print("La BolaA es la diferente ");
                    
                    if (BolaA > BolaB) {

                        System.out.println("Y es de mayor peso");

                    } else {

                        System.out.println("Y es de menor peso");

                    }
                    
                }
            }
        }

    }

}
