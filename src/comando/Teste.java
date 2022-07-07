package comando;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc_input = new Scanner(System.in);
        Switch mySwitch = new Switch();
        Lampada lamp = new Lampada();
        Comando switchUp = new InterruptorLigar(lamp);
        Comando switchDown = new InterruptorDesligar(lamp);

        while (true){
            System.out.println("1 ligar, 2 desligar");
            String g = sc_input.nextLine();
            switch (g) {
                case "1":
                    mySwitch.guardarEExecutar(switchUp);
                    break;
                case "2":
                    mySwitch.guardarEExecutar(switchDown);

            }
        }
    }
}
