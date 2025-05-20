public class RoboAspirador {
    private int numero, posicaoX, posicaoY, quantidadePo, limitePo;
    private String status;

    public RoboAspirador(int numero, int limitePo) {
        this.numero = numero;
        this.limitePo = limitePo;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
    }

    public void ligar() { status = "ligado"; }
    public void desligar() { status = "desligado"; }
    public void andar(int x, int y) {
        if (!status.equals("ligado")) return;
        posicaoX += x;
        posicaoY += y;
        status = "andando";
    }

    public void parar() {
        if (!status.equals("ligado") && !status.equals("andando")) return;
        status = "parado";
    }

    public void aspirar(int po) {
        if (!status.equals("ligado")) return;
        quantidadePo += po;
        if (quantidadePo >= limitePo) {
            status = "desligado";
            System.out.println("Limite de pó atingido! Robô desligado.");
        }
    }

    public String toString() {
        return "Robô #" + numero + " | Status: " + status + " | Posição: (" + posicaoX + "," + posicaoY + ") | Pó: " + quantidadePo;
    }
}
