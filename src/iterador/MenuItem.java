package iterador;

public class MenuItem {
     String nome;
    MenuItem(String nome)
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
