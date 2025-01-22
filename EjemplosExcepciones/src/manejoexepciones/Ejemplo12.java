/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        for (int i = 0; i < valor; i++) {
            boolean bandera = true;
            while (bandera) {
                try {
                    entrada.nextLine();
                    System.out.println("ingrese el primer numero");
                    int num1 = entrada.nextInt();
                    System.out.println("ingrese el segundo numero");
                    int num2 = entrada.nextInt();
                    resultados[i] = num1 / num2;
                    bandera = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.printf("Existe un error de tipo %s\n",
                            inputMismatchException);

                } catch (ArithmeticException arithmeticException) {
                    System.out.println("Lo sentimos hay un error");
                    System.out.printf("De tipo %s\n", arithmeticException);

                }
            }
        }
        String mensaje= "los valores del arreglo son ";
        for (int i = 0; i < valor; i++) {
            mensaje = String.format("%s[%d]", mensaje, resultados[i]);

            /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        }
        System.out.println(mensaje);
    }
 }