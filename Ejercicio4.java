import java.util.Scanner;

public class Ejercicio4 {

    private static int [][] matriz;
    private static boolean matrizCompleta = false;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    }

    public static void ejecutarMenu (Scanner sc, int x) {
        System.out.println("Menu");
        System.out.println("a: Rellenar matriz:");
        System.out.println("b: Sumar fila:");
        System.out.println("c: Sumar columna:");
        System.out.println("d: Sumar diagonal principal");
        System.out.println("e: Sumar diagonal inversa");
        System.out.println("f: La media de todos los valores de la matriz");
        System.out.println("g: Ver matriz");
        System.out.println("h: Salir menu");

        String opcionMenu = sc.next().toLowerCase();
        System.out.println("Opcion ingresada: " + opcionMenu);

        if(opcionMenu.equals("a")){
            opcionA(x, sc);
            ejecutarMenu(sc, x);

        }else{

            if(matrizCompleta ==  false){
                System.out.println("Debe completar primero la matriz, seleccione opción a");
                ejecutarMenu(sc, x);

            }else{
                if( opcionMenu.equals("b")){
                    opcionB(sc, x);
                    ejecutarMenu(sc, x);
                } else if (opcionMenu.equals("c")) {
                    opcionC(sc, x);   
                    ejecutarMenu(sc, x);
                }else if(opcionMenu.equals("d")){
                    opcionD(sc, x);
                    ejecutarMenu(sc, x);
                } else if(opcionMenu.equals("e")){
                    opcionE();
                    ejecutarMenu(sc, x);
                }else if(opcionMenu.equals("f")){
                    opcionF();
                    ejecutarMenu(sc, x);
                }else if (opcionMenu.equals("g")) {
                    opcionG();
                    ejecutarMenu(sc, x);
                }else if(opcionMenu.equals("h")) {
                    opcionH();
                }else {
                    System.out.println("Ingrese una opcion valida");
                    ejecutarMenu(sc, x);
                }
                
            }
        }
    }

    public static void opcionA(int x, Scanner sc){
        matriz = new int[x][x];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Ingrese un valor para la posición ["+ i +"]["+ j +"]");
                matriz[i][j] = sc.nextInt();
                System.out.println("Valor ingresado en la posición["+ i +"]["+ j +"] : " + matriz[i][j] );
            }
        }
        matrizCompleta = true;

    };

    public static void opcionB(Scanner sc, int x){
        int filaSumar = 0;
        
        do {
            System.out.println("Ingrese la fila que desea sumar");
            filaSumar = sc.nextInt();
            
            if(filaSumar < 0 || filaSumar >= x) {
                System.out.println("");
                System.out.println("Ingrese una fila valida");
            }
        }while(filaSumar < 0 || filaSumar >= x);
        
        System.out.println("Fila que deea sumar: " + filaSumar);
        
        int totalSumaFila = 0;
        
        for(int i  = 0; i < matriz[filaSumar-1].length; i++) {

            totalSumaFila = matriz[filaSumar-1][i] + totalSumaFila;
            System.out.println("Estoy sumando " + matriz[filaSumar-1][i] + "a el acumulado de "+ totalSumaFila );
        }

        System.out.println("Total suma: " + totalSumaFila);
    };

    public static void opcionC(Scanner sc, int x){
        int columnaSuma = 0;
        int totalSumaColumna = 0;

        do {
            System.out.println("Ingrese la columna que desea sumar");
            columnaSuma = sc.nextInt();
            if(columnaSuma < 0 || columnaSuma > x) {
                System.out.println("Ingrese una fila valida");
            }
        }while(columnaSuma < 0 || columnaSuma > x);
        System.out.println("Columna a sumar "+ columnaSuma);

        for(int i = 0; i < matriz.length; i++){
            totalSumaColumna += matriz[i][columnaSuma - 1];
        }
        System.out.println("Total suma columna: " + totalSumaColumna);
    };

    public static void opcionD(Scanner sc, int x){
        int sumaDiagonalPrincipal = 0;

        for(int i = 0; i < matriz.length; i++){
            sumaDiagonalPrincipal += matriz[i][i];
            System.out.println("valor a sumar " + matriz[i][i] + "total acumulado "+ sumaDiagonalPrincipal);
        }
        System.out.println("La suma total de la diagonal principal es: " + sumaDiagonalPrincipal);
    }
    
    public static void opcionE(){
        int sumaDiagonalInversa = 0;
        int lonMatriz = matriz.length;
        System.out.println(lonMatriz);
        
        for(int i = 0; i < lonMatriz ; i++){
            sumaDiagonalInversa += matriz[i][lonMatriz-1-i];
            System.out.println("valor a sumar " + matriz[i][lonMatriz-1-i] + "total acumulado "+ sumaDiagonalInversa);
        }
        System.out.println("La suma total de la diagonal inversa es: " + sumaDiagonalInversa);
    }
    public static void opcionF(){
        int totalElementos = 0;
        int suma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                suma += matriz[i][j];
                totalElementos++;
            }
        }

        int media = suma / totalElementos;
        System.out.println("La media de la matriz es: " + media);
    }

    public static void opcionG(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    public static void opcionH(){
        System.out.println("Salio del menu");
    }

}
