/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author conit
 */
import java.util.Scanner;
public class ArrayMultidimensionalEj13 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int X;

        do {
            System.out.print("Ingrese un valor entero que este entre 3 y 10: ");
            X = sc.nextInt();
        } while (X < 3 || X > 10);

        int[][] matrizUno = new int[X][X];

        
        System.out.println("Ingrese los valores para la matriz:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("Elemento de Matriz [" + i + "][" + j + "]: ");
                matrizUno[i][j] = sc.nextInt();
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Matriz resultante:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print(matrizUno[i][j] + "\t");
            }
            System.out.println();
        }

        
        int[] sumaColumnas = new int[X];
        for (int j = 0; j < X; j++) {
            for (int i = 0; i < X; i++) {
                sumaColumnas[j] += matrizUno[i][j];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("La suma de cada columna es de:");
        for (int j = 0; j < X; j++) {
            System.out.print(sumaColumnas[j] + "\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
        
        int sumaTotal = 0;
        for (int j = 0; j < X; j++) {
            sumaTotal += sumaColumnas[j];
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Suma total de las columnas es de: " + sumaTotal);
       
    }
}
