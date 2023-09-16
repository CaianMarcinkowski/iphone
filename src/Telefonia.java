public class Telefonia extends Iphone{

    public Telefonia(String cor, double versao, int capacidade) {
        super(cor, versao, capacidade);
    }
    
    public void ligar(){
        for(int i = 0; i < 10; i++){
            System.out.println("Ligando...");
            try {
                new Thread();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Não atendeu");
    }

    public void atender(){
        System.out.println("A chamada foi atendida");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("O correio de voz foi iniciado");
    }
}
