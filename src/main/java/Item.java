public class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Item setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getValor() {
        return valor;
    }

    public Item setValor(double valor) {
        this.valor = valor;
        return this;
    }
}
