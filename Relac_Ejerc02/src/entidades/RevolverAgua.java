
package entidades;

public class RevolverAgua {
    
    private Integer posicact;
    private Integer posicagua;

    public RevolverAgua() {
    }

    public RevolverAgua(Integer posicact, Integer posicagua) {
        this.posicact = posicact;
        this.posicagua = posicagua;
    }

    public Integer getPosicact() {
        return posicact;
    }

    public void setPosicact(Integer posicact) {
        this.posicact = posicact;
    }

    public Integer getPosicagua() {
        return posicagua;
    }

    public void setPosicagua(Integer posicagua) {
        this.posicagua = posicagua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicact=" + posicact + ", posicagua=" + posicagua + '}';
    }
    
    
    
}
