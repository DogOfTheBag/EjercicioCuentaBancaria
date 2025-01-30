package data;

/**
 *
 * @author alber
 */
/*Clase cuenta bancaria donde se hacen todas las gestiones de la cuenta bancaria*/
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    /*El saldo de la cuenta siempre empezará en 0, lo demás lo que nos de el user*/
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.saldo = 0.0;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    /*Meter dinero y sacar dinero cogen el dinero introducido por el user y lo 
    suman o lo restan respectivamente de la cuenta del usuario*/
    public double meterDinero(double dineroMetido){
        saldo = saldo + dineroMetido;
        return saldo;
    }
    
    public double sacarDinero(double dineroSacado){
        saldo = saldo - dineroSacado;
        return saldo;
    }

    public void mostrarDatos(){
        
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo en la cuenta: " + saldo);
        
    }
    /*Comprueba si el usuario intenta sacar mas dinero del que tiene
    o intenta sacar una cantidad negativa de dinero*/
    public boolean saldoValido(double dineroSacado){
        if(saldo-dineroSacado<0)
            return false;
        else
            return true;
    };
    
    public boolean sacarSaldoValido(double dineroSacado){
    if(dineroSacado<0)
        return false;
    else
        return true;
    };
     
}
