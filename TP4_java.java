import java.util.Scanner;

public class TP4_java {

    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio");
        int numeroEJercicio = sc.nextInt();
        switch (numeroEJercicio) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            default:
                break;
        }
    }


    
    public static void ejercicio1 (Scanner sc) {
        String[][] matrizPaises= new String[4][4];

        for(int i = 0; i < matrizPaises.length;i++){

            System.out.println("Ingrese el nombre del país " + (i + 1));
            matrizPaises[i][0]= sc.nextLine();

            for(int j = 1; j < matrizPaises[0].length; j++) {
                System.out.println("Ingrese la ciudad numero " + j +" para el pais: " + matrizPaises[i][0]);
                matrizPaises[i ][j] = sc.nextLine();
            }
        }

        for(int i = 0; i < matrizPaises.length; i++) {
            System.out.println("Pais: " + matrizPaises[i][0]);
            for(int j = 1 ; j < matrizPaises[0].length; j++){
                System.out.println("Ciudad: " + matrizPaises[i][j]);
            }
        }
    }

    public static void ejercicio2 (Scanner sc) {
       
        // Pedir los valores X e Y
        System.out.print("Ingrese el valor de X: ");
        int X = sc.nextInt();
        System.out.print("Ingrese el valor de Y: ");
        int Y = sc.nextInt();

        // Crear el primer array [X][Y]
        int[][] array1 = new int[X][Y];
        System.out.println("Ingrese los valores para el primer array [X][Y]:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.printf("array1[%d][%d]: ", i, j);
                array1[i][j] = sc.nextInt();
            }
        }

        // Crear el segundo array [Y][X]
        int[][] array2 = new int[Y][X];
        System.out.println("Ingrese los valores para el segundo array [Y][X]:");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.printf("array2[%d][%d]: ", i, j);
                array2[i][j] = sc.nextInt();
            }
        }

        // Crear el tercer array [X][Y] para almacenar el resultado
        int[][] arrayResultado = new int[X][Y];

        // Realizar la multiplicación de matrices
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                arrayResultado[i][j] = 0; // Inicializar la posición
                for (int k = 0; k < Y; k++) {
                    arrayResultado[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        // Mostrar los resultados
        System.out.println("Primer array [X][Y]:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Segundo array [Y][X]:");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Resultado de la multiplicación [X][Y]:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(arrayResultado[i][j] + " ");
            }
            System.out.println();
        }

        // Cerrar el sc
        sc.close();
 
    }

    public static void ejercicio4(Scanner sc){
        int x = 0;
        do{
            System.out.println("Ingrese un valor para X entre 4 y 10 ");
            x = sc.nextInt();
        }while(x < 4 || x > 10);
        
        Ejercicio4 ejercicioMenu = new Ejercicio4();
        ejercicioMenu.ejecutarMenu(sc,x);
       
    }
     
    public static void ejercicio5(Scanner sc){
        Ejercicio5 ejercicioGolosina = new Ejercicio5();
        ejercicioGolosina.ejecutarMenu(sc);
    }
}