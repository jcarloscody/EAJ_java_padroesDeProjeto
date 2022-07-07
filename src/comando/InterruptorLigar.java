package comando;

public class InterruptorLigar implements Comando {
    private Lampada lampada;

    public InterruptorLigar(Lampada lampada) {
        this.lampada = lampada;
    }
    @Override    // Command
    public void execute() {
        lampada.ligado();
    }
}
