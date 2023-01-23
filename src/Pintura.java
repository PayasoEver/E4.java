public class Pintura {
    private double cobertura;

    public  Pintura(double cobertura){
        this.cobertura=cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }
    public double getCobertura() {
        return cobertura;
    }

    public double rellenar(Forma fo){
        return fo.getArea()/cobertura;
    }
}
