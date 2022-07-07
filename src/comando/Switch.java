package comando;

import java.util.ArrayList;
import java.util.List;

/** Classe invocadora */
public class Switch {
    private List<Comando> historico = new ArrayList<Comando>();

    public void guardarEExecutar(Comando cmd) {
        this.historico.add(cmd); // optional
        cmd.execute();
    }
}
