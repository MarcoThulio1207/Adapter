public class BuracoRedondo{
    private double raio;

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public boolean encaixe(PinoRedondo pino){
        return  pino.getRaio() <= this.raio;
    }

}