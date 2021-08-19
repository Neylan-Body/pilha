package one.digitalinnovation;

public class No {
    private int dado;
    private No proxNo = null;

    public int getDado() {
        return dado;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }

    public No(int dado) {
        this.dado = dado;
    }

    public No(){

    }
}
