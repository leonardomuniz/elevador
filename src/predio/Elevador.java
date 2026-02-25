package predio;

public class Elevador {
    private int andarAtual;
    private Status status;

    public Elevador() {
        this.andarAtual = 0;
        this.status = Status.PARADO;
    }

    public void subir() {
        this.status = Status.SUBINDO;
        this.andarAtual += 1;
    }

    public void descer() {
        this.status = Status.DESCENDO;
        this.andarAtual -= 1;
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
