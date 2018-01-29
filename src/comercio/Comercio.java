
package comercio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx=new Metodos();
        Ticket obxTicket=new Ticket();
        obxTicket=obx.buscar("2");
        System.out.println(obxTicket.toString());
        
    }
    
}
