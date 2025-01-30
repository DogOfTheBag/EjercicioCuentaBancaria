package data;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Menu {
    /*necesitaremos las opciones para visualizarlas, la cuenta bancaria para
    hacer gestiones, y un scanner para pillar las cosas del user*/
    private Opcion[] ops;
    private CuentaBancaria cb;
    Scanner sc = new Scanner(System.in);

    public Menu(Opcion[] ops, CuentaBancaria cb){
        this.ops = ops;
        this.cb = cb;
    }
    /*visualizar*/
    public void vis(){
        for (int i = 0; i < ops.length; i++){
            ops[i].vis();
        }
    }
    /*pequeño metodo que "limpia" la pantalla de la consola*/
    private void CLS(){
        for (int i = 0; i < 50; i++) {
            System.out.println(" ");
            
        }
    }
    /*switch con las elecciones del usuario, uso thread.sleep para parar los mensajes
    y que se puedan leer bien*/
    public void gestionarMenu(int eleccion) throws InterruptedException{
        int dinero;
        
        switch(eleccion){
            case 1:
                System.out.println("Introduce el dinero a meter: ");
                dinero = sc.nextInt();
                cb.meterDinero((int)dinero);
                System.out.println("Gestionando transaccion...");
                Thread.sleep(2000);
                System.out.println("La transaccion se ha realizado con exito");
                break;
                
            case 2:
                System.out.println("Introduce el dinero a sacar: ");
                dinero = sc.nextInt();

                if (cb.sacarSaldoValido(dinero) == true && cb.saldoValido(dinero)==true){
                    cb.sacarDinero((int)dinero);
                    System.out.println("Gestionando transaccion...");
                    Thread.sleep(2000);
                    System.out.println("La transaccion se ha realizado con exito");
                }
                else
                    System.out.println("La cantidad introducida no es valida...");
                break;

            case 3:
                System.out.println("El saldo de la cuenta es: " + cb.getSaldo());
                Thread.sleep(2000);
                break;

            case 4:
                System.out.println("Los datos de la cuenta son:");
                cb.mostrarDatos();
                Thread.sleep(2000);
                break;

                /*el default lo que hace es que cualquier cosa que ponga
                el usuario que no sean las opciones anteriores muestre eso*/
            case 5:
                System.out.println("Cerrando la aplicacion...");
                break;
            default:
                System.out.println("La introduccion introducida no es valida");
                Thread.sleep(1000);
        }
        
        Thread.sleep(1000);
        CLS();
    }

}
