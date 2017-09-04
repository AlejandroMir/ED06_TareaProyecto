
 
package ed06_tareaproyecto;
/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);
        Empleado.imprimir_empl(empleado1);
    }

    
}
