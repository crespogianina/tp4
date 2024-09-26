import java.util.Scanner;

public class Ejercicio5 {
    static Object[][] maquinaGolosinas = {
                                    {"KitKat", 32, 10},
                                    {"Chicles",2,50},
                                    {"Caramelos de Menta",2,50},
                                    {"Huevo Kinder",25,10},
                                    {"Chetoos",30,10},
                                    {"Twix",26,10},
                                    {"M&M'S",35,10},
                                    {"Papas Lays",40,20},
                                    {"Milkybar",30,10},
                                    {"Alfajor Tofi",20,15},
                                    {"Lata Coca",50,20},
                                    {"Chitos",45,10}};   
    public static void main (){
        Scanner sc = new Scanner(System.in);
    }

    public static void ejecutarMenu(Scanner sc){
        sc.nextLine();

        
        System.out.println("Menu:");
        System.out.println("a: Pedir golosina");
        System.out.println("b: Mostrar golosinas");
        System.out.println("c: Rellenar golosinas");
        System.out.println("d: Apagar maquina");

        String opcionMenu = sc.nextLine();

        switch (opcionMenu) {
            case "a":
                pedirGolosina(sc);
                ejecutarMenu(sc);
                break;
            case "b":
                mostrarGolosinas(sc);
                ejecutarMenu(sc);
                break;
            case "c":
                rellenarGolosinas(sc);
                ejecutarMenu(sc);
                break;
            case "d":
                apagarMaquina();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                ejecutarMenu(sc);
                break;
        }
    }

    public static void pedirGolosina(Scanner sc){
        System.out.println("Ingrese la fila de la golosina que desea");
        int filaGolosina = sc.nextInt();
        System.out.println( "La golosina que desea es: " + maquinaGolosinas[filaGolosina][0]);

        int cantidadGolosinas = (int) maquinaGolosinas[filaGolosina][2];

        if(cantidadGolosinas <= 0) {
            System.out.println("No hay stock");
        }else{   
            maquinaGolosinas[filaGolosina][2] = cantidadGolosinas - 1; 
            System.out.println("La cantidad restante es: " + maquinaGolosinas[filaGolosina][2] );
        }
    };

    public static void mostrarGolosinas(Scanner sc){
        System.out.println("Golosinas:");

        for(int i = 0; i < maquinaGolosinas.length;i++){
            System.out.println("Golosina: "+ maquinaGolosinas[i][0] + " , cantidad: " + maquinaGolosinas[i][2]);
        }
    }

    public static void rellenarGolosinas(Scanner sc){
        String password = "AdminXYZ";

        System.out.println("Ingrese la contraseña");
        String passwordIngresada = sc.nextLine();

        if(password.equals(passwordIngresada)){
            System.out.println("Acceso permitido");
            System.out.println("Ingrese la posición de la golosina que desea cambiar: ");
            int cambiarGolosina = sc.nextInt();

            System.out.println("Ingrese la cantidad a recargar: ");
            int cantidadACatidad = sc.nextInt();

            int golosinasActual = (int) maquinaGolosinas[cambiarGolosina][2] + cantidadACatidad;  

            maquinaGolosinas[cambiarGolosina][2] = golosinasActual;
            System.out.println("Se actualizo correctamente el stock de la golosina: "+ maquinaGolosinas[cambiarGolosina][0]+ ", la cantidad: " + golosinasActual);
            ejecutarMenu(sc);
        } else{
            System.out.println("Acceso invalido");
            ejecutarMenu(sc);
        }
    }

    public static void apagarMaquina(){
        System.out.println("Vuelva pronto.... :) ");
        System.out.println("Gracias por consumir ");
    }
}
