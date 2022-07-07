package comando;

public class InterruptorDesligar implements Comando {
    private Lampada lampada;

    public InterruptorDesligar(Lampada lampada) {
        this.lampada = lampada;
    }
    @Override    // Command
    public void execute() {
        lampada.desligado();
    }
}
