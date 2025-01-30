package data;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    
    public static void main(String[] args) throws InterruptedException {
        /*hago scanner, cuenta bancaria, opciones y menu*/
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cb = new CuentaBancaria("5489-7485-8745-1455","Alberto Cortijo Perez");
        Opcion[] ops = {
            new Opcion (1,"Meter dinero"),
            new Opcion (2,"Sacar dinero"),
            new Opcion (3,"Comprobar balance"),
            new Opcion (4,"Mostrar datos de la cuenta"),
            new Opcion (5,"Salir de la cuenta")
        };
        
        Menu m = new Menu(ops,cb);
        
        int eleccion;
        /*cuando el user pone 5 se sale*/
        do{
        m.vis();
        System.out.println("\nIntroduce la opcion deseada: ");
        eleccion = sc.nextInt();
        m.gestionarMenu(eleccion);
        }while(eleccion !=5);
        
        System.out.println("¡Que tenga un buen dia!");
    
    }
    
}
