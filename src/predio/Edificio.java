package predio;

public class Edificio {
    private int totalAndares;
    private Elevador elevador;

    public Edificio(int totalAndares) {
        this.totalAndares = totalAndares;
        this.elevador = new Elevador();
    }

    public void subir() {
        this.elevador.setStatus(Status.SUBINDO);
        this.elevador.setAndarAtual(this.elevador.getAndarAtual() + 1);
    }


    public void descer() {
        this.elevador.setStatus(Status.DESCENDO);
        this.elevador.setAndarAtual(this.elevador.getAndarAtual() - 1);
    }

    public void irParaAndar(int destino) throws InterruptedException {
        if (!checar(destino)) {
            return;
        }

        System.out.println("O elevador está " + this.elevador.getStatus() + " se preparando");
        while (destino != this.elevador.getAndarAtual()) {
            long sleepLength = 175L;

            System.out.println("saindo do andar " + this.elevador.getAndarAtual() + " " + this.elevador.getStatus() +" para o andar " + this.elevador.getAndarAtual() + 1);

            if ( destino > this.elevador.getAndarAtual() ){
                subir();
            }

            if (destino < this.elevador.getAndarAtual()) {
                descer();
            }
            Thread.sleep(sleepLength);
        }

        this.elevador.setStatus(Status.PARADO);
        System.out.println("Você chegou no seu destino");
    }


    public boolean checar(int destino) {
        if (destino < 0 || destino > totalAndares) {
            System.out.println("Escolha um andar entre 0 e " + totalAndares);
            return false;
        }

        if (this.elevador.getStatus() != Status.PARADO) {
            return false;
        }

        return true;
    }
}
