public class Baralho {
    private int CartasUsadas;
    public final int numCartas=52;
    public int embaralhadas;

    private Cartas[] baralho = new Cartas[numCartas];

    public Baralho() {
        int QtdNaipe=4;
        int QtdValor=13;
        int CartasCriadas=0;

    for (int naipes=1;naipes<QtdNaipe;naipes++){
        for (int valores=1; valores<=QtdValor;valores++){
            baralho[CartasCriadas]=new Cartas(naipes,valores);
            CartasCriadas++;
        }
        System.out.println(baralho);
    }
    CartasUsadas=0;
    }

    public void embaralhar() {
        for(int i=0; i< baralho.length; i++) {
            int numAleatorio = (int) (Math.random()*baralho.length); //Math random vai de 0=<x<1, por isso a multiplicação.
            Cartas embaralhadas = baralho[i];
            baralho[i]=baralho[numAleatorio];
            baralho[numAleatorio]=embaralhadas;
        }
    }
    public void darCartas(){
        embaralhar();
        int QtdCartasJogador=2;
        for (int i =0;i<=QtdCartasJogador; i++){
        }


        public Cartas temCartas() {
        if (CartasUsadas==baralho.length)
            throw new IllegalStateException("Não há cartas disponiveis");
            IllegalStateException
    }
    public void imprimir() {
        System.out.println();
        }

    String [] Lista2Cartas = new String[2];
    String [] Lista5Cartas = new String[5];

    }
    }







