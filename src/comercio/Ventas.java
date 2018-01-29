
package comercio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Ventas {
    private String nV;
    private String refProducto;
    private float cantidade;

    public Ventas() {
    }

    public Ventas(String nV, String refProducto, float cantidade) {
        this.nV=nV;
        this.refProducto=refProducto;
        this.cantidade=cantidade;
    }

    public String getnV() {
        return nV;
    }

    public void setnV(String nV) {
        this.nV=nV;
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto=refProducto;
    }

    public float getCantidade() {
        return cantidade;
    }

    public void setCantidade(float cantidade) {
        this.cantidade=cantidade;
    }

    @Override
    public String toString() {
        return "Numero Ventas:"+nV+", Referencia Producto: "+refProducto+", Cantidade: "+cantidade;
    }
}
