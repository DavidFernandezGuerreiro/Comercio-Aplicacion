
package comercio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Productos {
    private String refProducto;
    private String nome;
    private String refPrecio;

    public Productos() {
    }

    public Productos(String refProducto, String nome, String refPrecio) {
        this.refProducto=refProducto;
        this.nome=nome;
        this.refPrecio=refPrecio;
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto=refProducto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getRefPrecio() {
        return refPrecio;
    }

    public void setRefPrecio(String refPrecio) {
        this.refPrecio=refPrecio;
    }

    @Override
    public String toString() {
        return "Referencia Producto: "+refProducto+", Nome: "+nome+", Referencia Precio: "+refPrecio;
    }
    
    
    
    
}
