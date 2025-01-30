package data;

/**
 *
 * @author alber
 */
/*clase opcion para mostrar las opciones despues por el menu*/
public class Opcion {
    private int num;
    private String texto;

    public Opcion(int num, String texto) {
        this.num = num;
        this.texto = texto;
    }
    
    public void vis(){
        System.out.println(num + ". " + texto);
    }
}
