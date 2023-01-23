import java.lang.annotation.Repeatable;

public class MainPintura {
    public static void main(String[] args) {
        Forma fo=new Forma("Rectangulo");
        Pintura pito= new Pintura(250);
        Rectangulo reco=new Rectangulo(20,35);
        fo=reco;
        System.out.println(pito.rellenar(fo));
        Cilindro ciri=new Cilindro(30,10);
        fo=ciri;
        System.out.println(pito.rellenar(fo));
        Esfera bobo=new Esfera(15);
        fo=bobo;
        System.out.println(pito.rellenar(fo));


    }
}
