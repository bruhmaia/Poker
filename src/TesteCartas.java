public class TesteCartas {
    public static void main(String[] args) {


        String[] baralho = new String[52];

        String[] naipes = {"♣", "♦", "♠", "♥"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // forma o baralho juntando os dois arrays (naipes e valores)
        for (int i = 0; i < 52; i++) {
            baralho[i] = valores[i % 13] + naipes[i / 13];
            System.out.println(baralho[i]);

        }
        // embaralha o baralho
        for (int i = 0; i < baralho.length; i++) {
            int numAleatorio = (int) (Math.random() * baralho.length); //Math random vai de 0=<x<1, por isso a multiplicação.
            String embaralhadas = baralho[i];
            baralho[i] = baralho[numAleatorio];
            baralho[numAleatorio] = embaralhadas
            System.out.println(baralho[i]);
        }


    }
}