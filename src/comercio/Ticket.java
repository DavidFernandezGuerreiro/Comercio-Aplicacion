
package comercio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Ticket {
    private String nV;
    private String nome;
    private float prezoTotal;

    public Ticket() {
    }

    public Ticket(String nV, String nome, float prezoTotal) {
        this.nV=nV;
        this.nome=nome;
        this.prezoTotal=prezoTotal;
    }

    public String getnV() {
        return nV;
    }

    public void setnV(String nV) {
        this.nV=nV;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public float getPrezoTotal() {
        return prezoTotal;
    }

    public void setPrezoTotal(float prezoTotal) {
        this.prezoTotal=prezoTotal;
    }

    @Override
    public String toString() {
        return "Numero Ventas: "+nV+", Nome: "+nome+", Prezo Total: "+prezoTotal;
    }
    
    
}
