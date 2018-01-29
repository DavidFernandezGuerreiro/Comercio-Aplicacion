
package comercio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos {
    
    Ventas[]arrayVentas={new Ventas("1","rpro1",7F),new Ventas("2","rpro2",9F),new Ventas("3","rpro3",4F)};
    Productos[]arrayProductos={new Productos("rpro3","uvas","rpre1"),new Productos("rpro1","peras","rpre3"),new Productos("rpro2","patacas","rpre2")};
    Precio[]arrayPrecio={new Precio("rpre2",2F),new Precio("rpre1",5F),new Precio("rpre3",7F)};
    
    
    public Ticket buscar(String nVentas){
        Ticket obxTicket=new Ticket();
        for(int i=0;i<arrayVentas.length;i++){
            if(nVentas.equals(arrayVentas[i].getnV())){
                obxTicket.setnV(nVentas);
                for(Productos pro:arrayProductos){
                    if(arrayVentas[i].getRefProducto().equals(pro.getRefProducto())){
                        obxTicket.setNome(pro.getNome());
                    }
                    for(Precio prec:arrayPrecio){
                        if(pro.getRefPrecio().equals(prec.getRefPrecio())){
                            prec.getPrecio();
                            obxTicket.setPrezoTotal(prec.getPrecio()*arrayVentas[i].getCantidade());
                        }
                    } 
                }
            }             
        } 
        return obxTicket;
    }
}

