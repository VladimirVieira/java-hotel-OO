public class QuartoCasal implements Quarto {
    private int numero;
    private int andar;
    
    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public int getAndar() {
        return andar;
    }

    public QuartoCasal(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    @Override
    public String getTipoDeQuarto() {
        return "Quarto de casal";
    }

    @Override
    public String toString() {
        return "Número do quarto: " + this.numero +
                "\nAndar: " + this.andar + 
                "\nTipo do quarto: " + this.getTipoDeQuarto();
    }
}
