public class Principal {
    public static void main(String[] args) {
        BuracoRedondo buraco = new BuracoRedondo(10);

        PinoRedondo pinoRedondop = new PinoRedondoConcreto(2);

        System.out.println("O pino redondo pequeno se encaixa aqui?" + buraco.encaixe(pinoRedondop));

        PinoQuadrado pinoQuadradoPequeno = new PinoQuadrado(5);

        PinoRedondo adaptadorPinoQuadradoPequeno = new AdaptadorPinoQuadrado(pinoQuadradoPequeno);

        System.out.println("Pino quadrado pequeno adaptado se encaixa? " + buraco.encaixe(adaptadorPinoQuadradoPequeno));
    }


}
