import java.lang.reflect.Array;
import java.util.Arrays;
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
        System.out.println("Ingrese el valor que corresponde a X: ");
        int x = sc.nextInt();

        System.out.println("Ingrese el numero que corresponde a Y: ");
        int y = sc.nextInt();

        int [][] primerArray = new int[x][y];
        for(int i = 0; i < primerArray.length; i++){
            for(int j = 0; j < primerArray[0].length; j++) {
                System.out.println("ingrese el numero que va en la posición [" + i +"]"+"[" + j +"]"+ "del primer array" );
                primerArray[i][j] = sc.nextInt();
            }
        }

        int [][] segundoArray = new int[y][x];
        for(int i = 0; i < segundoArray.length; i++){
            for(int j = 0; j < segundoArray[0].length; j++) {
                System.out.println("ingrese el numero que va en la posición [" + i +"]"+"[" + j +"]"+ "del segundo array" );
                segundoArray[i][j] = sc.nextInt();
            }
        }

        int [][] tercerArray = new int[x][y];
        for(int i = 0; i < tercerArray.length;i++){
            for( int j = 0; j < tercerArray[0].length; j++) {
                System.out.println("La multiplicación de la fila de primer array posición [" + i +"]"+"[" + j +"] por la posición [" + j +"]"+"[" + i +"] del segundo array" );
                tercerArray[i][j] = primerArray[i][j] * segundoArray[j][i];
            }
        }


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