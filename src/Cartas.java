public class Cartas {
    private int naipe;
    private int valor;

    public Cartas(int naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String TransformarValor() {
        switch (valor) {
            case 1:
                return "A";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "J";
            case 12:
                return "Q";
            default:
                return "K";
        }
    }

    public String TransformarNaipe() {
        switch (naipe) {
            case 1:
                return "♣";
            case 2:
                return "♦";
            case 3:
                return "♠";
            case 4:
                return "♥";
        }
        return null;
    }
}