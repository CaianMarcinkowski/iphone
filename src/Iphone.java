public class Iphone {

    private String cor;
    private double versao;
    private int capacidade;

    public Iphone(String cor, double versao, int capacidade) {
        this.cor = cor;
        this.versao = versao;
        this.capacidade = capacidade;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public double getVersao() {
        return versao;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }


    public static void main(String[] args) throws Exception {
        
    }
}
