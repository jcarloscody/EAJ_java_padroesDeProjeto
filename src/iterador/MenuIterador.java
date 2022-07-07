package iterador;

public class MenuIterador implements  Iterador{
    MenuItem[] items;
    int posicao = 0;

    public MenuIterador(MenuItem[] items)
    {
        this.items= items;
    }
    @Override
    public boolean hasNext() {
        if (posicao>= items.length || items[posicao] == null)
        {
            return  false;
        } else {
            return  true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[posicao];
        posicao++;
        return menuItem;
    }


}
