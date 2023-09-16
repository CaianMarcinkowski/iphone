public class Navegador extends Iphone{

    public Navegador(String cor, double versao, int capacidade) {
        super(cor, versao, capacidade);
    }
    
    public void attPagina(){
        System.out.println("A pagina foi atualizada");
    }

    public void addNovaAba(){
        System.out.println("Uma nova aba foi adicionada");
    }

    public void exibirPagina(){
        System.out.println("A pagina foi exibida");
    }
}
