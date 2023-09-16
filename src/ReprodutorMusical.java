public class ReprodutorMusical extends Iphone{

    public ReprodutorMusical(String cor, double versao, int capacidade) {
        super(cor, versao, capacidade);
    }

    public void tocar(){
        System.out.println("A musica esta tocando");
    }
    
    public void pausar(){
        System.out.println("A musica foi pausada");
    }

    public void selecionarMusica(){
        System.out.println("A musica foi selecionada");
    }
}
