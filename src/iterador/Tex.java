package iterador;

public class Tex
{
    public static void main(String[] args) {

        MenuItem[] m = new MenuItem[10];

        m[0] =  new MenuItem("sds");
        m[1] =  new MenuItem("sds");
        m[2] =  new MenuItem("sds");
        m[3] =  new MenuItem("sds");
        MenuIterador m1 = new MenuIterador(m);
        while (m1.hasNext()){
     //       if (m1.next() instanceof MenuItem){
            System.out.println(((MenuItem) m1.next()).nome);
        //    }
        }
    }
}
